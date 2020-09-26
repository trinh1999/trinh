package ThreadRobot;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numRobots = 2;
        int maxMove = 30;
        List<RobotThread> robotThreadList = new ArrayList<>();
        for (int i = 0; i < numRobots; i++) {
            robotThreadList.add(new RobotThread(i, 0, new Robot(), maxMove));
        }
        ExecutorService executor = Executors.newFixedThreadPool(numRobots);
        for (int i = 0; i < numRobots; i++) {
            executor.execute(robotThreadList.get(i));
        }
        executor.shutdown();
        boolean running = true;
        Instant start = Instant.now();
        while (running) {
            for (RobotThread robot_thread : robotThreadList) {
                if (robot_thread.getCurNumMove() == robot_thread.getMaxMove()) {
                    running = false;
                    continue;
                }
                double distance = SumDistanceRobot.sumDistance(robotThreadList.get(0).getRobot(),
                        robotThreadList
                                .subList(1, robotThreadList.size())
                                .stream()
                                .map(RobotThread::getRobot)
                                .collect(Collectors.toList()));
                System.out.println("At " + (Duration.between(start, Instant.now()).toMillis() / 1000) + "s: "
                        + "-------> Sum Distance: " + distance);
                running = true;
                break;
            }
            Thread.sleep(13000);
        }

//        double distance = SumDistanceRobot.sumDistance(robotThreadList.get(0).getRobot(),
//                robotThreadList
//                        .subList(1, robotThreadList.size())
//                        .stream()
//                        .map(ThreadRobot::getRobot)
//                        .collect(Collectors.toList()));
//        System.out.println("At " + (Duration.between(start, Instant.now()).toMillis() / 1000) + "s: "
//                + "-------> Sum Distance: " + distance);
    }
}
