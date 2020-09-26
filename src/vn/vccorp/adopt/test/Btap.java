package vn.vccorp.adopt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Btap {
    public void tso(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 9;
        while (i >= 2 && i <10) {
            if(n%i==0){
            n = n / i;
            list.add(i);
            }else {
                i--;
            }
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.print("so nho nhat can tim: ");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j));
        }

    }
    public static void main(String[] args) {
        Btap bt = new Btap();
        bt.tso(100);
    }

}
