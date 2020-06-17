package com.pluralsight.linkedList;

public class FirstNode{

    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
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

        first.next=second;
        second.next = null;

        System.out.println("Value "+ first.getValue() +" Next Node: "+first.getNext());
        System.out.println("Value "+ second.getValue() +" Next Node: "+second.getNext());

    }
}