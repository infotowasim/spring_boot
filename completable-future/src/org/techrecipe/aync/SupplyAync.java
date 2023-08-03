package org.techrecipe.aync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplyAync {
	
	public static void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		
		
		
		Supplier<String> supplier = ()-> {
			delay(1);
			System.out.println ("I am Supplier- "+ Thread.currentThread().getName());
			return "Hello from Supplier";
		};
		
		CompletableFuture<String> completetableFuture = CompletableFuture.supplyAsync(supplier);
		System.out.println("I am in Main");
		
		String value=completetableFuture.join();
		System.out.println("Value- "+value);
		
	}
	
	
	
}
