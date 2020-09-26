package vn.vccorp.adopt.test;

import java.util.BitSet;

public class Bitset {
    public static void main(String[] args) {
        BitSet a = new BitSet(10);
        BitSet b = new BitSet(10);
        for (int i = 0; i < 10; i++) {
            if ((i%2)==0){
                a.set(i);
            }
            if((i%3)!=0){
                b.set(i);
            }
        }
        System.out.println("bitset a la: " + a);
        System.out.println("bitset b la: "+ b);
        a.and(b);
        System.out.println("a and b:" +a );
        a.or(b);
        System.out.println("a or b: " +a);
        a.xor(b);
        System.out.println("a xor b:"+ a);
    }
}
