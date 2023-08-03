public class ThreadUsingLambda {
    public static void main(String[] args) {
        Thread t1=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}


