package Robot;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadRobot extends Thread {
    private String threadName;
    private RobotCuaCooPoint1 robot;

    public ThreadRobot(String threadName, RobotCuaCooPoint1 robot) {
        this.threadName = threadName;
        this.robot = robot;
    }

    public ThreadRobot() {
    }

    public ThreadRobot(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void DonViDiChuyen() {

        int dem = 0;
//        long start= System.currentTimeMillis();
//        System.out.println("thoi gian bat dau: "+start);
//        setTimeout(System.out::println, 1000);
        for (int i = 0; i < 2000000000; i++) {
            dem++;
            DiChuyen();
            System.out.println("buoc di thu : " + dem);
//            setTimeout(() -> System.out.println("test111111111"), 20000);
        }
        if (dem > 2000000000) {
            for (int i = 2000000000; i > 0; i--) {
                dem--;
                DiChuyen();
                System.out.println("buoc di thu : " + dem);
            }
        }
    }

    //    public static void setTimeout(Runnable runnable, int delay){
//        new Thread(() -> {
//            try {
//                Thread.sleep(delay);
//                runnable.run();
//            }
//            catch (Exception e){
//                System.err.println(e);
//            }
//            RobotCuaCooPoint1 robot1= new RobotCuaCooPoint1();
//            RobotCuaCooPoint1 robot2= new RobotCuaCooPoint1();
//            double khoangCach= Math.sqrt(Math.pow(robot2.current_posision.getX()-robot1.current_posision.getX(),2)+
//                    Math.pow(robot2.current_posision.getY()-robot1.current_posision.getY(),2));
//            System.out.println("khoang cach: "+khoangCach);
//        }).start();
//    }
    public double KhoangCach(RobotCuaCooPoint1 robot1, RobotCuaCooPoint1 robot2) {
        double khoangCach = Math.sqrt(Math.pow(robot2.current_posision.getX() - robot1.current_posision.getX(), 2) +
                Math.pow(robot2.current_posision.getY() - robot1.current_posision.getY(), 2));
        return khoangCach;
    }

    public void DiChuyen() {
        try {
            ThreadRobot.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        RobotCuaCooPoint1 robotCuaCooPoint1 = new RobotCuaCooPoint1();
//        robotCuaCooPoint1.move(Direction1.getRandom(), random.nextInt(10000000 - 10) + 10);
        System.out.println(this.getThreadName() + ":" + robotCuaCooPoint1.getCurrentPosision());

    }

    @Override
    public void run() {
        DonViDiChuyen();
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadRobot t1 = new ThreadRobot("Robot1");
        ThreadRobot t2 = new ThreadRobot("Robot2");
        ThreadRobot t3 = new ThreadRobot("Robot3");
        ThreadRobot t4 = new ThreadRobot("Robot4");
        ThreadRobot t5 = new ThreadRobot("Robot5");
        ThreadRobot t6 = new ThreadRobot("Robot6");
        ThreadRobot t7 = new ThreadRobot("Robot7");
        ThreadRobot t8 = new ThreadRobot("Robot8");
        ThreadRobot t9 = new ThreadRobot("Robot9");
        ThreadRobot t10 = new ThreadRobot("Robot10");

        ThreadRobot tong = new ThreadRobot("tong") {
            @Override
            public void run() {
                System.out.println("tong la:" );
            }
        };
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(3);
        scheduledExecutorService.scheduleAtFixedRate(tong, 14, 1, TimeUnit.SECONDS);
        t1.start();
        t1.join(3000);
        t2.start();
        t2.join(3000);
        t3.start();
        t3.join(3000);
        t4.start();
        t4.join(3000);
        t5.start();
        t5.join(3000);
        t6.start();
        t6.join(3000);
        t7.start();
        t7.join(3000);
        t8.start();
        t8.join(3000);
        t9.start();
        t9.join(3000);
        t10.start();

    }
}

