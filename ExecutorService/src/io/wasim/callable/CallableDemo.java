package io.wasim.callable;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> aTask=()-> "My Task";

        Future<String> futureTask = executorService.submit(aTask);
        Future<Integer> futureTask2 = executorService.submit(new CallableClient(10)); //,,,

        System.out.println("String" + futureTask.get());
        System.out.println("Integer" + futureTask2.get()); //,,,,,
    }

}
