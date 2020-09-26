package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread3 extends Thread {

    private String ThreadName;

    public Thread3(String threadName) {
        ThreadName = threadName;
    }

    public String getThreadName() {
        return ThreadName;
    }

    public void setThreadName(String threadName) {
        ThreadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(ThreadName + "bat dau: ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ThreadName + "ket thuc: ");
    }

    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("aaaa");
//        runnable.run();


        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(4);
//        for (int i = 0; i < 10; i++) {
//            Thread3 thread3= new Thread3("thread3"+i);
//            executorService.execute(thread3);
//        }
//        executorService.shutdown();

        List<Future> futureList = new ArrayList<Future>();
        for (int i = 1; i <= 10; i++) {
            Thread3 thread3 = new Thread3("Runnable " + i);
            Future future = executorService.submit(thread3);
            futureList.add(future);

            for (Future future1 : futureList) {
                try {
                    System.out.println(future1.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

            executorService.shutdown();

        }
    }
}
