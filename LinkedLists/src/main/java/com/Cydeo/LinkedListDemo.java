package com.Cydeo;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;


        System.out.println(node1);
        System.out.println(node1.next.id+" id of the second node");
        System.out.println("next address is "+ node1.next);
    }
}
