class Hi extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}



public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1=new Hi();
        Hello obj2=new Hello();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

    }
}
