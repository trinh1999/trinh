package Robot;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainThread implements Runnable{
    static RobotThread thread1 = new RobotThread(1);
    static RobotThread thread2 = new RobotThread(2);
    static RobotThread thread3 = new RobotThread(3);
    static RobotThread thread4 = new RobotThread(4);
    static RobotThread thread5 = new RobotThread(5);
    static RobotThread thread6 = new RobotThread(6);
    static RobotThread thread7 = new RobotThread(7);
    static RobotThread thread8 = new RobotThread(8);
    static RobotThread thread9 = new RobotThread(9);
    static RobotThread thread10 = new RobotThread(10);


    public long distance(CooPoint cooPoint1, CooPoint cooPoint2) {
        long distancex = (long) Math.sqrt(Math.pow(cooPoint1.getX() - cooPoint2.getX(), 2));
        long distancey = (long) Math.sqrt(Math.pow(cooPoint2.getY() - cooPoint2.getY(), 2));
        long distance12 = distancex + distancey;
        return distance12;
    }

    @Override
    public void run() {                                                                              

        CooPoint p1 = thread1.getCurrent_position();
        CooPoint p2 = thread2.getCurrent_position();
        CooPoint p3 = thread3.getCurrent_position();
        CooPoint p4 = thread4.getCurrent_position();
        CooPoint p5 = thread5.getCurrent_position();
        CooPoint p6 = thread6.getCurrent_position();
        CooPoint p7 = thread7.getCurrent_position();
        CooPoint p8 = thread8.getCurrent_position();
        CooPoint p9 = thread9.getCurrent_position();
        CooPoint p10 = thread10.getCurrent_position();

        System.out.print("Tong khoang cach cua Robot1 vs 9 Robot con lai la: " );
        System.out.println(distance(p1, p2) + distance(p1, p3) + distance(p1, p4) + distance(p1, p5) + distance(p1, p6) + distance(p1, p7)
                + distance(p1, p8) + distance(p1, p9) + distance(p1, p10));
    }

    public static void main(String[] args) throws InterruptedException {

        Thread distance11 = new Thread(new MainThread());
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        executor.scheduleAtFixedRate(distance11, 13, 13, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread1, 0, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread2, 3, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread3, 6, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread4, 9, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread5, 12, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread6, 15, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread7, 18, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread8, 21, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread9, 24, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(thread10, 27, 5, TimeUnit.SECONDS);
    }
}
