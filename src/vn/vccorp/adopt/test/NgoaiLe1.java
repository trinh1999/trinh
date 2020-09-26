package vn.vccorp.adopt.test;

import java.io.IOException;
import java.io.FileInputStream;

public class NgoaiLe1 {

    public static void main(String[] args) {
        NgoaiLe1 s1 = new NgoaiLe1();
        System.out.println(s1.them(10));
    }
    private static int them(int A) {
        int C = 0;
        try{
            for (int i = -1; i < 5; i++) {
                C = A / i;
                System.out.println("gia tri c: " + C );
            }
            return C;
        }catch (Exception e){
            System.out.println("1111111");
                    return 1;
        }finally {
            System.out.println("hom nay an gi: ");
        }
    }
}
