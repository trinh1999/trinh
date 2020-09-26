package vn.vccorp.adopt.test;

import java.util.*;

public class SapXepSet {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        Set<Integer> set= new LinkedHashSet<>(list);
        List<Integer> list1= new ArrayList<>(set);
        Collections.sort(list1);
        set= new LinkedHashSet<>(list1);
        System.out.println(set);
    }
}
