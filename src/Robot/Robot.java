package Robot;


import java.util.HashMap;
import java.util.Map;

enum Direction{
     AHEAD, T_LEFT, T_RIGH;


}

class CooPoint {
    private int x;
    private int y;
    private String huong;
    private Map<String, String> quayPhai;
    private Map<String, String> quayTrai;

    public CooPoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.huong = "x+";
        this.quayPhai = new HashMap<>();
        this.quayTrai = new HashMap<>();
        this.quayPhai.put("x+", "y-");
        this.quayPhai.put("y-", "x-");
        this.quayPhai.put("x-", "y+");
        this.quayPhai.put("y+", "x+");
        this.quayTrai.put("y-", "x+");
        this.quayTrai.put("x-", "y-");
        this.quayTrai.put("y+", "x-");
        this.quayTrai.put("x+", "y+");
    }

    public CooPoint() {

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

    // huong x+,x-,y+,y-
    public void move(int distance) {
        if (this.huong.charAt(0) == 'x') {
            if (this.huong.charAt(1) == '+') {
                this.x += distance;
            } else {
                this.x -= distance;
            }
        } else {
            if (this.huong.charAt(1) == '+') {
                this.y += distance;
            } else {
                this.y -= distance;
            }
        }
    }

    public void quay(String huongQuay) {
        if (huongQuay == "Phai") {
            this.huong = this.quayPhai.get(this.huong);
        }
        if (huongQuay == "Trai") {
            this.huong = this.quayTrai.get(this.huong);
        }
    }

    public void AHEAD(int distance) {
        move(distance);
    }

    public void T_LEFT(int distance) {
        quay("Trai");
        move(distance);
    }

    public void T_RIGH(int distance) {
        quay("Phai");
        move(distance);
    }

    @Override
    public String toString() {
        return "CooPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        CooPoint cooPoint = new CooPoint(0, 0);
        cooPoint.T_LEFT(8);
        cooPoint.T_RIGH(3);
        cooPoint.T_RIGH(2);
        System.out.println(cooPoint);
    }
}

