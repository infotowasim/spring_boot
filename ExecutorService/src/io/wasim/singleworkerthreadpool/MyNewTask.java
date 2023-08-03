package io.wasim.singleworkerthreadpool;

public class MyNewTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My 3rd Task");
    }
}
