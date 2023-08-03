package com.wasim.combiningindependentfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Handle {
    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        boolean error=true;  // false=success , true=null
        CompletableFuture<String> future = CompletableFuture.supplyAsync( ()->{
            if (error) throw new RuntimeException("Error@Future");
            return "Success";
        }).handle((s,e)->{
            if (e!=null){
                System.out.println(e.getMessage());
                return null;
            }
            return s;
        });

        System.out.println(future.join());
    }

}
