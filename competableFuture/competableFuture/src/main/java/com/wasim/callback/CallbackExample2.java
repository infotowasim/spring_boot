package com.wasim.callback;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CallbackExample2 {

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
        }).thenRun( ()->{
            System.out.println("Finished.");
        });
        completableFuture.join();
    }

}
