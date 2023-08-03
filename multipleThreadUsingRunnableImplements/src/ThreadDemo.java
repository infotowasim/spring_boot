class Hi implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ThreadDemo {
    public static void main(String[] args) {

        Runnable obj1=new Hi();
        Runnable obj2=new Hello();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}
