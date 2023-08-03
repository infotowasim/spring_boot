package io.wasim.multipleworkthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecutorService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable aTask1=()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("My Task1 Started");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My Task1 Ended");
        };


        Runnable aTask2=()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("My Task2 Started");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My Task2 Ended");
        };


        Runnable aTask3=()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("My Task3 Started");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My Task3 Ended");
        };

        executorService.submit(aTask1);
        executorService.submit(aTask2);
        executorService.submit(aTask3);

        executorService.shutdown();

    }
}
