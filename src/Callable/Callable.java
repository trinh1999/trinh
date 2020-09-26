package Callable;

import java.util.Random;

public class Callable implements java.util.concurrent.Callable {
    private Random random;
    private int num;

    public Callable(int num) {
        this.num = num;
        this.random = new Random();
    }

    public Integer call() throws Exception {
        Thread.sleep(random.nextInt(10) * 1000);
        int result = num * num;
        System.out.println("Complete " + result);
        return result;
    }
}
