package io.wasim.callable;

import java.util.concurrent.Callable;

public class CallableClient implements Callable<Integer> {

    int input;

    public CallableClient(int input) {
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i=1;i<=input;i++){
            sum=sum+i;
        }
        return sum;
    }
}
