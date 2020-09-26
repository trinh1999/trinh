package vn.vccorp.adopt.test;

public class LopTime {
    private int hour;
    private int minute;
    private int second;

    public LopTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void nextSecond() {
        second ++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }
    public void previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            {
                if (minute == -1) {
                    minute = 59;
                    hour--;
                    if (hour == -1) {
                        hour = 23;
                    }
                }
            }
        }
    }
    void display() {
        String hour = this.hour + "";
        String minute = this.minute + "";
        String second = this.second + "";
        if (hour.length() == 1)
            hour = "0" + hour;
        if (minute.length() == 1)
            minute = "0" + minute;
        if (second.length() == 1)
            second = "0" + second;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
class Entry<I extends Number, S> {
    public static void main(String[] args) {
        LopTime t = new LopTime(12, 1, 1);
        t.display();
        t.setTime(23, 59, 59);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(7, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}
