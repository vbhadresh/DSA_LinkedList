package com.pluralsight.linkedList;

public class PrintNode {

    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value= value;
            this.next = next;
        }
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(3);
        Node second = new Node(6);
        /*Node third = new Node(5);*/
        Node fourth = new Node(10);
        Node third = new Node(15,fourth);
        first.next=second;
        second.next=third;
        third.next=fourth;
        printNode(first);
    }

    private static void printNode(Node node){
        // As long as node is not null , iterate over it
        while(node!=null){
            System.out.println(node.getValue());
            // get the next node
            node =node.next;
        }
    }
}
