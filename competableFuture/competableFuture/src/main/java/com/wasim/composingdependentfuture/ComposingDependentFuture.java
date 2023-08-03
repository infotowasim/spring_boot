package com.wasim.composingdependentfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// thenCompose()-method allows us to change the 2 different CF or
public class ComposingDependentFuture {

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //creating 2 Asynchorized task
    public static CompletableFuture<String> getUserDetails(){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("getUserDetails() " +Thread.currentThread().getName());
            delay(2);
            return "UserDetails";
        });
    }

    public static CompletableFuture<String> getWishList(String user){

        return CompletableFuture.supplyAsync(()->{
            System.out.println("getWishList() - "+user +"- "+Thread.currentThread().getName());
            delay(3);
            return "User's WishList";
        });

    }

    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        CompletableFuture<String> future = getUserDetails().thenCompose(s -> {
            return getWishList(s);
        });
        System.out.println("Doing something ");
        delay(4);
        System.out.println(future.join());
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken " + (endTime-startTime)/1000);
    }


}
