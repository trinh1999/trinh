package Test;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer integer = new Integer(1);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(integer.floatValue());
    }
}
