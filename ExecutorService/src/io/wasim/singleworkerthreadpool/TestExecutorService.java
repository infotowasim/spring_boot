package io.wasim.singleworkerthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable aTask1=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My 1st Task");
            }
        };

        Runnable aTask2=()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("My 2nd Task");
        };

        MyNewTask aTask3=new MyNewTask();

        executorService.submit(aTask1);
        executorService.submit(aTask2);
        executorService.submit(aTask3);

        executorService.shutdown();
    }
}
