package vn.vccorp.adopt.test;

public class Enum {
    enum Day{
        SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
        private int value;

        Day(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Day day= Day.SUNDAY;
        System.out.println(day);
        for (Day day1: Day.values()) {
            System.out.println(day1+" "+day1.value);
        }
    }
}
