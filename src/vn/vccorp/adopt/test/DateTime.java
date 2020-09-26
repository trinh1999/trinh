package vn.vccorp.adopt.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws ParseException {
//       //ngay thang hien tai
//        System.out.println(LocalDateTime.now());
//        Date date= new Date();
//        System.out.println(date);
//

        //tru ngay gio
        String datebd = "08/22/2020 09:54:35";
        String datekt = "08/23/2020 10:55:32";
        Date date1=new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(date1));
        System.out.println(simpleDateFormat.format(LocalDateTime.now().minusDays(2).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));

        //        Date date2=null;
//        try {
//            date1=simpleDateFormat.parse(datebd);
//            date2=simpleDateFormat.parse(datekt);
//            long tru = date2.getTime()-date1.getTime();
//            long truss = tru / 1000 % 60;
//            long trumm = tru / (60 * 1000) % 60;
//            long truHH = tru / (60 * 60 * 1000) % 24;
//            long truday = tru / (24 * 60 * 60 * 1000);
//
//            System.out.print(truday + " day, ");
//            System.out.print(truHH + " HH, ");
//            System.out.print(trumm + " mm, ");
//            System.out.print(truss + " ss.");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

//        //xu ly ngay gio vs calendar
//        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("MM/dd/yyyy");
//        Calendar calendar= Calendar.getInstance();
//        System.out.println("thoi gian hien tai: "+calendar.getTime());
//        calendar.add(Calendar.DATE, 2);
//        System.out.println("tang len 2 ngay: "+calendar.getTime());
//        calendar.add(Calendar.HOUR_OF_DAY,-2);
//        System.out.println("giam di 2 gio: "+ calendar.getTime());
//        //khong thay doi doi tuong lon hon
//        calendar.roll(Calendar.DAY_OF_MONTH,1);
//        System.out.println("thay doi ngay khong doi thang: "+calendar.getTime());
//
//
//        //sd localdate them ngay thang nam
//        LocalDate mydate1 = LocalDate.of(1999,9,28);
//        LocalDate mydate2= LocalDate.of(2030,9,28);
//        System.out.println("my date 1: "+mydate1);
//        mydate1= mydate1.plusDays(2);
//        mydate2= mydate2.plusYears(2);
//        System.out.println(mydate1);
//        System.out.println(mydate1.equals(mydate2));
//
//
//        isLeapYear(1234);



    }
    // xet nam nhuan
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;

        }
        return false;

    }
}
