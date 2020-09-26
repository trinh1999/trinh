package ThreadRobot;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class RobotThread extends Thread{
    private int idx;
    private int curNumMove;
    private int maxMove;
    private Robot robot;

    public int getIdx() {
        return idx;
    }

    public int getCurNumMove() {
        return curNumMove;
    }

    public int getMaxMove() {
        return maxMove;
    }

    public Robot getRobot() {
        return robot;
    }


    public RobotThread(int idx, int curNumMove, Robot robot, int maxMove) {
        this.idx = idx;
        this.curNumMove = curNumMove;
        this.robot = robot;
        this.maxMove = maxMove;

    }

    public RobotThread() {
    }

    @Override
    public void run() {
        try {
            Instant start = Instant.now();
            Thread.sleep(3000 * idx);
            boolean moved;
            while (curNumMove < maxMove) {
                System.out.println("Robot " + idx + ", " + "times " + curNumMove + " at " + (Duration.between(start, Instant.now()).toMillis() / 1000) + "s");
                System.out.println("Robot " + idx + ": " + robot);
                // Robot move
                do {

                    E_Move move = E_Move.getRandomMove();
                    int distance = Robot.getRandomDistance();
                    System.out.println("Robot " + idx + ", " +
                            "times " + curNumMove +
                            ",  Move:  " + move +
                            ", Distance: " + distance);
                    moved = robot.move(move, distance);
                    if (!moved) {
                        System.out.println("Move Faileddddddddddddddddddddddddd. Move " + move +
                                ", Distance: " + distance);

                    }
                    System.out.println("Robot " + idx + ": " + robot);
                } while (!moved);
                curNumMove += 1;
                Thread.sleep(5000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
class SumDistanceRobot {
    public static double sumDistance(Robot mainRobot, List<Robot> otherRobots) {
        double sum = 0;
        CooPoint mainPos = mainRobot.cur_position;
        for (int i = 0; i < otherRobots.size(); i++) {
            CooPoint ortherPos = otherRobots.get(i).cur_position;
            sum += CooPoint.distance(mainPos,ortherPos);
        }
        return sum;
    }
}