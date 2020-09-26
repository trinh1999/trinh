package BaiTapLan1;

import java.util.HashSet;
import java.util.Set;

public class BaiTap1 {
    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<>();
        for (int i = 0; i < 1999999; i++) {
            set1.add(i);
        }
        Set<Integer> set2= new HashSet<>();
        for (int i = 1879999; i < 3879999; i++) {
            set2.add(i);
        }

        long bd1= System.currentTimeMillis();
        set1.addAll(set2);
        long kt1= System.currentTimeMillis();
        long t1= kt1-bd1;
        System.out.println("thoi gian tim tap hop la: "+ t1);

        long bd2= System.currentTimeMillis();
        set1.retainAll(set2);
        long kt2= System.currentTimeMillis();
        long t2= kt2-bd2;
        System.out.println("thoi gian tim giao nhau la: "+t2);

        System.out.println("thoi gian tong la: "+(t2+t1) );
    }

}
