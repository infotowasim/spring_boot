class Q{
    int num;
    boolean valueSet=false;
    public synchronized void setValue(int num) throws InterruptedException {
        while (valueSet){
            wait();
        }
        System.out.println("SetValue: " + num);
        this.num=num;
        valueSet=true;
        notify();
    }
    public synchronized void getValue() throws InterruptedException {
        while (!valueSet){
            wait();
        }
        System.out.println("GetValue: " + num);
        valueSet=false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    public Producer(Q q) {
        this.q = q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while (true){
            try {
                q.setValue(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }

    }



class Consumer implements Runnable{
    Q q;
    public Consumer(Q q) {
        this.q = q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    @Override
    public void run() {
        while (true){
            try {
                q.getValue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}



public class MultiThreadingInterCommunication {
    public static void main(String[] args) {

        Q q =new Q();
        new Producer(q);
        new Consumer(q);

    }
}
