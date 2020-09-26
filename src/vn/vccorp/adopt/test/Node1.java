package vn.vccorp.adopt.test;

public class Node1 {
    int data;
    Node1 next;

    public Node1(int data, Node1 next){
        this.data=data;
        this.next=next;
    }
    //chen data tai vi tri k
    public static void them(Node1 linklist, int data, int vitri){
        Node1 nodemoi= linklist;
        for (int i = 0; i < vitri-1; i++) {
            nodemoi=nodemoi.next;
        }
        Node1 nodemoimoi= new Node1(data,null);
        nodemoimoi.data=data;
        nodemoimoi.next=nodemoi.next;
        nodemoi.next=nodemoimoi;

    }
    public static void xoa(Node1 linklist, int vitri){
        Node1 nodemoi=linklist;
        for (int i = 0; i < vitri-1; i++) {
            nodemoi=nodemoi.next;
        }
        Node1 nodemoimoi=nodemoi.next;
        nodemoi.next=nodemoimoi.next;
    }
    public static void duyet(Node1 linklist){
        Node1 nodemoi= linklist;
        while (nodemoi!=null){
            System.out.print(nodemoi.data+" ");
            nodemoi=nodemoi.next;
        }
    }

    public static void main(String[] args) {
        Node1 nodeDau= new Node1(1,null);
        Node1 node1= new Node1(2,null);
        nodeDau.next=node1;
        Node1 node2= new Node1(3,null);
        node1.next=node2;
        Node1 node3= new Node1(4,null);
        node2.next=node3;
        Node1 node4= new Node1(5,null);
        node3.next=node4;
        duyet(nodeDau);
//        xoa(nodeDau,1);
//        System.out.println("");
//        duyet(nodeDau);
        them(nodeDau,4,4);
        System.out.println("");
        duyet(nodeDau);
    }
}
