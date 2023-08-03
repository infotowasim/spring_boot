public class MultiThreadPriority {

    public static void main(String[] args) throws Exception {
        Thread t1=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        t1.join();
        t2.join();

        System.out.println("BY");

    }

}
