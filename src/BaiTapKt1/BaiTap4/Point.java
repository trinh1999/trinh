package BaiTapKt1.BaiTap4;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public long distance(Point cooPoint1, Point cooPoint2) {
        long distancex = (long) Math.sqrt(Math.pow(cooPoint1.getX() - cooPoint2.getX(), 2));
        long distancey = (long) Math.sqrt(Math.pow(cooPoint1.getY() - cooPoint2.getY(), 2));
        long distance12 = distancex + distancey;
        return distance12;
    }
}
