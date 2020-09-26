package vn.vccorp.adopt.test;

public class MyNode {
    int value;
    MyNode next;

    public MyNode(int value, MyNode next) {
        this.value = value;
        this.next = next;
    }

    public static void xoaNode(MyNode linkedList, int viTri){
        MyNode nodePrevious = linkedList;
        while(viTri > 0){
            nodePrevious = linkedList;
            linkedList = linkedList.next;
            viTri--;
        }
        nodePrevious.next = linkedList.next;
    }

    public static void duyetNode(MyNode linkedList){
        while(linkedList!=null){
            System.out.print(linkedList.value+" ");
            linkedList = linkedList.next;
        }
    }

    public static void main(String[] args) {
        MyNode root = new MyNode(1,null);
        MyNode node1 = new MyNode(2,null);
        root.next = node1;
        MyNode node2 = new MyNode(3,null);
        node1.next = node2;
        MyNode node3 = new MyNode(4,null);
        node2.next = node3;
        duyetNode(root);
        xoaNode(root,1);
        System.out.println("");
        duyetNode(root);
    }
}
