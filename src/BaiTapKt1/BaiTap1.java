package BaiTapKt1;

import java.util.*;

public class BaiTap1 {

    public void RandomTapHop() {
        long bd1= System.currentTimeMillis();
        Random r = new Random();
//        List<Integer> list1= new ArrayList<>();
//        for (int i = 0; i < 2000000; i++) {
//            int t1 = r.nextInt(2000000);
//            if(!list1.contains(i)) {
//                list1.add(t1);
//            }
//        }
//        Set<Integer> set1= new HashSet<>(list1);
//        System.out.println(set1);
//
//        List<Integer> list2= new ArrayList<>();
//        for (int i = 0; i < 2000000; i++) {
//            int t2 = r.nextInt(2000000);
//            if(!list2.contains(i)) {
//                list2.add(t2);
//            }
//        }
//        Set<Integer> set2= new HashSet<>(list2);
//        Set<Integer> set3= new HashSet<>();
//        set3.addAll(set1);


        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 2000000; i++) {
            int t1 = r.nextInt(2000000);
            set1.add(t1);
        }
        Set<Integer> set3= new HashSet<>();
        set3.addAll(set1);


        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 2000000; i++) {
            int t1 = r.nextInt(2000000);
            set2.add(t1);
        }

        set1.retainAll(set2);
        if (set1.size()<110000){
            RandomTapHop();
        }else {
            set3.addAll(set2);
            long kt1 = System.currentTimeMillis();
            long t1 = kt1 - bd1;
            System.out.println("thoi gian tao giao nhau va tap hop la: " + (t1));
        }

    }

    public static void main (String[]args) {
        BaiTap1 baiTap1 = new BaiTap1();
        baiTap1.RandomTapHop();

    }
}
