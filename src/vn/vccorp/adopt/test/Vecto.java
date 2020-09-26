package vn.vccorp.adopt.test;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Vecto {
    public static void main(String[] args) {
//      Vector<String> vector= new Vector();
//      vector.add("dam");
//      vector.add("tring");
//      System.out.println(vector);
//      System.out.println("Truy cap da phan tu: "+ vector.get(1));
////    tra ve doi tuong lap de truy cap cac phan tu 1 cach tuan tu
//      Iterator<String> iterate = vector.iterator();
//      System.out.print("Vector: ");
//      while(iterate.hasNext()) {
//          System.out.print(iterate.next());
//          System.out.print(", ");}


        //Stack la lop phu cua lop Vector
        Stack<String> stack= new Stack<>();
        stack.push("dam");
        stack.push("thi");
        stack.push("trinh");
        System.out.println(stack);
//        System.out.println(stack.pop());
        while(!stack.isEmpty()){
            //tra ve ptu dau mà ko loai khoi stack
            System.out.print(stack.peek());
            //tr ve phan tu dau
            System.out.println("");
            stack.pop();
        }
    }

}

