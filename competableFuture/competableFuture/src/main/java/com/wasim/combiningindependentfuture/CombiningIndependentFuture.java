package com.wasim.combiningindependentfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CombiningIndependentFuture {

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static CompletableFuture<String> getUserEmail(){
        return CompletableFuture.supplyAsync(
                ()->{
                    System.out.println("getUserEmail() " +Thread.currentThread().getName());
                    delay(3);
                    return "wasim@gmail.com";
                });
    }

    public static CompletableFuture<String> getWeatherReport(){
        return CompletableFuture.supplyAsync(
                ()->{
                    System.out.println("getWeatherReport() " +Thread.currentThread().getName());
                    delay(5);
                    return "Weather report of city is Rainy";
        });
    }

    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();

        CompletableFuture<String> future = getUserEmail()
                .thenCombine(getWeatherReport(), (e, w) -> {
                    System.out.println("Sending email to " + e + "Weather report" + w);
                    delay(1);
                    return e + w;
                });

        System.out.println("Do Something");
        delay(3);
        System.out.println(future.join());
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken "+(endTime-startTime)/1000);
    }
}
