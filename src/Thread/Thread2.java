package Thread;

import java.util.concurrent.*;

public class Thread2 implements Runnable {
    public String threadName;

    public Thread2() {
    }

    public Thread2(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public String setThreadName(String threadName) {
        this.threadName = threadName;
        return threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getThreadName() + " " + i);
        }
    }

        public static void main (String[]args){

            Thread2 t = new Thread2();
            Thread2 tt= new Thread2();
            Thread t1 = new Thread(t);
            Thread t2 = new Thread(tt);
            t1.setName(t.setThreadName("Thread1"));
            t2.setName(tt.setThreadName("Thread2"));
            t1.start();
            t2.start();
            Runnable runnable = () -> System.out.println("a");
//            runnable.run();

            ExecutorService executors = Executors.newFixedThreadPool(3);
            executors.submit(runnable);
            executors.submit(runnable);

            ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(3);
            scheduledExecutorService.scheduleAtFixedRate(runnable,5,10, TimeUnit.SECONDS);

            scheduledExecutorService.scheduleAtFixedRate(() -> {
                System.out.println("abc");
            },5,10,TimeUnit.SECONDS);
            System.out.println(Runtime.getRuntime().availableProcessors());
        }
}
