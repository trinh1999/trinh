package Thread;

public class Thread1 extends Thread {
    private String threadName;

    public Thread1(){

    }

    public Thread1(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getThreadName()+""+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread1 t2= new Thread1();

        t1.setThreadName("thread1");
        t2.setThreadName("thread2");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
