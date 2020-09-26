package ThreadRobot;

import java.util.Random;

public class Robot {
    CooPoint cur_position;
    E_Direction cur_direction;

    public Robot() {
        this.cur_position = new CooPoint(Integer.MAX_VALUE, 0);
        cur_direction = E_Direction.getRandomDirection();

    }

    public static int getRandomDistance() {
        Random rd = new Random();
        int max = 10000000;
        int min = 10;
        return rd.nextInt(max - min) + min;
    }


    public boolean move(E_Move move, int distance) {
        E_Direction newDirection = CooPoint.getNewDirection(cur_direction, move);
        int newX = cur_position.getX();
        int newY = cur_position.getY();
        boolean canMove = false;
        switch (newDirection) {
            case POS_X:
                if (newX <= Integer.MAX_VALUE - distance) {
                    newX += distance;
                    canMove = true;
                }
                break;
            case POS_Y:
                if (newY <= Integer.MAX_VALUE - distance) {
                    newY += distance;
                    canMove = true;
                }
                break;
            case NEG_X:
                if (newX >= Integer.MIN_VALUE + distance) {
                    newX -= distance;
                    canMove = true;
                }
                break;
            case NEG_Y:
                if (newY >= Integer.MIN_VALUE + distance) {
                    newY -= distance;
                    canMove = true;
                }
                break;
            default:
                System.out.println(" sai roi");
                return false;
        }
        if (canMove) {
            cur_position = new CooPoint(newX, newY);
            cur_direction = newDirection;
        }
        return canMove;
    }

    public CooPoint getCurrentPosition() {
        return cur_position;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "cur_position=" + cur_position +
                ", cur_direction=" + cur_direction +
                '}';
    }
}
