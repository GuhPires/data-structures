package com.guhpires.datastructures;

/*
* This is a simple implementation of a Singly Linked List in Java.
* In this particular implementation addition and deletion are done into the head, this means that
* it basically works as a Stack (LIFO).
*
* Author: GuhPires
* Visit: https://github.com/GuhPires/data-structures
* ---- Feel completely free to modify this code and give me suggestions! ----
* */

public class LinkedList<T> {
    private int size = 0;
    private Node head = null;

    public class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T d, Node n) {
            this.data = d;
            this.next = n;
        }

        public T peek() { return this.data; }

        public Node next() { return this.next; }
    }

    public int size() { return this.size; }

    public boolean isEmpty() { return size() == 0; }

    public void add(T element) {
        Node node = new Node(element, this.head);
        this.head = node;
        this.size++;
    }

    public void remove() {
        if(isEmpty()) throw new RuntimeException("The Linked List is empty.");
        Node deleted = this.head;
        this.head = deleted.next;
        deleted = null;
    }

    public Node getHead() { return this.head; }

    public void print() {
        Node node = this.head;
        while(node != null) {
            System.out.print(" -> " + node.data);
            node = node.next;
        }
        System.out.println("");
    }
}
