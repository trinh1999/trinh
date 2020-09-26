package Robot;

import Robot.CooPoint;

import java.util.Random;

public class RobotThread implements Runnable{
    private CooPoint current_position;
    Random random = new Random();
    private int mat = random.nextInt(4);
    int stt;

    public RobotThread() {
    }


    public int getMat() {
        return mat;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String face() {
        String face = "";
        switch (this.getMat()) {
            case 0:
                face += "Chieu duong Ox";
                break;
            case 1:
                face += "Chieu am Ox";
                break;
            case 2:
                face += "Chieu duong Oy";
                break;
            case 3:
                face += "Chieu am Oy";
                break;
        }
        return face;
    }


    public RobotThread(int stt) {
        current_position = new CooPoint();
        this.stt = stt;
    }

    public RobotThread(CooPoint current_position) {
        this.current_position = current_position;
    }

    public CooPoint getCurrent_position() {
        return current_position;
    }

    public void setCurrent_position(CooPoint current_position) {
        this.current_position = current_position;
    }

    public synchronized void move(int moveDirection, int distance) {
        switch (this.getMat()) {
            case 0: // mat the chieu duong Ox
                if (moveDirection == 0) { // neu di thang
                    if (current_position.getX() + distance < 2000)
                        current_position.setX(current_position.getX() + distance);
                } else if (moveDirection == 1) { // neu sang trai
                    if (current_position.getY() + distance < 2000)
                        current_position.setY(current_position.getY() + distance);
                    this.setMat(2);
                } else if (moveDirection == 2) { // neu sang phai
                    if (current_position.getY() - distance < 2000)
                        current_position.setY(current_position.getY() - distance);
                    this.setMat(3);
                }
                break;
            case 1: // mat the chieu am Ox
                if (moveDirection == 0) {// neu di thang
                    current_position.setX(current_position.getX() - distance);
                } else if (moveDirection == 1) { // neu sang trai
                    current_position.setY(current_position.getY() - distance);
                    this.setMat(3);
                } else if (moveDirection == 2) { // neu sang phai
                    if (current_position.getY() + distance < 2000)
                        current_position.setY(current_position.getY() + distance);
                    this.setMat(2);
                }
                break;
            case 2: // mat the chieu duong Oy
                if (moveDirection == 0) { // neu di thang
                    if (current_position.getY() + distance < 2000)
                        current_position.setY(current_position.getY() + distance);
                } else if (moveDirection == 1) { // neu sang trai
                    current_position.setX(current_position.getX() - distance);
                    this.setMat(1);
                } else if (moveDirection == 2) { // neu sang phai
                    if (current_position.getX() + distance < 2000)
                        current_position.setX(current_position.getX() + distance);
                    this.setMat(0);
                }
                break;
            case 3: // mat the chieu am Oy
                if (moveDirection == 0) { // neu di thang
                    current_position.setY(current_position.getY() - distance);
                } else if (moveDirection == 1) { // neu sang trai
                    if (current_position.getX() + distance < 2000)
                        current_position.setX(current_position.getX() + distance);
                    this.setMat(0);
                } else if (moveDirection == 2) { // neu sang phai
                    current_position.setX(current_position.getX() - distance);
                    this.setMat(1);
                }
                break;
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        int moveDirection = random.nextInt(3);
        int distance = random.nextInt();
        String direction = "";
        if (moveDirection == 0) direction += "Di thang";
        else if (moveDirection == 1) direction += "Re trai";
        else direction += "Re phai";
        System.out.println(getCurrent_position() +"  "+ face() + "  " + direction + "  khoang cach " + distance);
        move(moveDirection, distance);
        try {
            Thread.currentThread().setName("Robot" + stt);
            System.out.println("Thread " +
                    Thread.currentThread().getName() +
                    " is running" + getCurrent_position());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
