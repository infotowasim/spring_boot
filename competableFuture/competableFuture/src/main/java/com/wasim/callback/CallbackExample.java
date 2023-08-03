package com.wasim.callback;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CallbackExample {

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture=CompletableFuture.supplyAsync( ()->{
            delay(1);
            return "Wasim";
        }).thenApply( s->{
            return "Hello " +s;
        }).thenAccept(s->{
            System.out.println("Result: " +s);
        });
        completableFuture.join();
    }

}
