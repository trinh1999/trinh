package vn.vccorp.adopt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChuyenDoi_Date_String {
    public static void main(String[] args) {
        //date thanh string
//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        String stdate = format.format(date);
//        System.out.println(stdate);

        //string thanh date
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        String stdate= "12/03/2222";
        try {
            Date date= dateFormat.parse(stdate);
            System.out.println("date thanh string: "+ date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}

