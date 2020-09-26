package vn.vccorp.adopt.test;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NgoaiLe {
    public static void main(String[] args) throws IOException {

        Integer C =0;
        try( FileOutputStream file = new FileOutputStream("ABC.txt")){
            for (int i = -4; i < 5; i++) {
                C=10/i;
                file.write(C);
            }
            file.close();
        }catch(ArithmeticException | FileNotFoundException e) {
            System.out.println(e);
            System.out.println("da bat ngoai le:");
        }

//        for (int i = 0; i < 100; i++) {
//            try {
//                if (i == 10) {
//                    int a = i / 0;
//                } else {
//                    System.out.println(i);
//                }
//            } catch (Exception e) {
//                System.out.println("input sai");
//            }
//        }
//    }
}}
