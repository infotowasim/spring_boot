package com.wasim.runAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunAsyncExample {

    public static void delay(int seconds){   //Utility Method
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        //task
        Runnable runnable=()->{
            delay(1);
            System.out.println("I am in Runnable - " + Thread.currentThread().getName());
        };

        CompletableFuture<Void> completableFuture=CompletableFuture.runAsync(runnable);
        System.out.println("I am in main - " + Thread.currentThread().getName());
        completableFuture.join();  // Join method wait for completable future to complete




    }
}