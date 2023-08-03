package com.wasim.supplyAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplyAsyncExample {

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        Supplier<String> supplier=()->{
            delay(1);
            System.out.println("I am in Supplier- "+Thread.currentThread().getName());
            return "Hello from Supplier";
        };

        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(supplier);
        System.out.println("I am in main");
        String value = completableFuture.join(); // join method used for completing the Completable Future complete
        System.out.println("Value- "+value);
    }


}
