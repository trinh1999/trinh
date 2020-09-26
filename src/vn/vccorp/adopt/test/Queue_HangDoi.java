package vn.vccorp.adopt.test;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_HangDoi {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        queue.add("dam");
        queue.add("thi");
        queue.add("trinh");
        System.out.println(queue);
        queue.offer("t.rinh");
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("sau khi loai bo dau"+queue);

    }
}
