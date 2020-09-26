package vn.vccorp.adopt.test;

import java.util.Scanner;

public class HasingChuoi {
        public static void hasingChuoi(String s){
            int A = 2;
            int B = 112;
            double hash = 0;
            for (int i = 0; i < s.length(); i++) {
                char character = s.charAt(i);
                int accii = (int) character;
                hash = (hash + (accii * Math.pow(A, i))) % B;
            }
            System.out.println("hash bang: " + hash);
        }

    public static void main(String[] args) {
            hasingChuoi("ABC");
    }
}
