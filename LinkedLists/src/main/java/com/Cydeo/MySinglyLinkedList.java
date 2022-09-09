package com.Cydeo;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }

    }
    void printNodes(){
        Node current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id+"=> ");
            }
            current=current.next;
        }
    }
    void deletById(int id){
        if (isEmpty()){
            System.out.println("is empty");
        }
        Node current = head;
        Node prev = head;
        while (current != null) { if (current.id == id) {// if you find a match
// Case 1: current is head
// Case 2: current is tail
// Case 3: current is middle
// after deletion
            if (current==head){
                head=current.next;
                current.next=null;
            } else if (current==tail) {
                tail=prev;
                prev.next=null; //ex tail will be eligible for garbage collection
            }else {
                prev.next=current.next;
                current.next=null;
            }
            size--;
        }
// move to other nodes in the list after the deletion
            prev = current;
            current = current.next;
        }
    }
}
