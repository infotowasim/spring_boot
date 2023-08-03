package com.wasim.combiningindependentfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AllOffExample2 {

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static CompletableFuture<Integer> future1(){
        return CompletableFuture.supplyAsync( ()->{
            System.out.println("future1() "+Thread.currentThread().getName());
            delay(2);
            return Integer.valueOf(12);
        });
    }


    public static CompletableFuture<Double> future2(){
        return CompletableFuture.supplyAsync( ()->{
            System.out.println("future2() "+Thread.currentThread().getName());
            delay(4);
            return Double.valueOf(12.23);
        });
    }


    public static CompletableFuture<String> future3(){
        return CompletableFuture.supplyAsync( ()->{
            System.out.println("future3() " +Thread.currentThread().getName());
            delay(3);
            return "3";

        });
    }


    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();

        CompletableFuture<Integer> future1 = future1();
        CompletableFuture<Double> future2 = future2();
        CompletableFuture<String> future3 = future3();

        CompletableFuture<Void> future = CompletableFuture.allOf(future1, future2, future3).thenAccept(
                ignore -> {
                    System.out.println(future1.join());
                    System.out.println(future2.join());
                    System.out.println(future3.join());
                }
        );
        future.join();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken " + (endTime-startTime)/1000);
    }

}
