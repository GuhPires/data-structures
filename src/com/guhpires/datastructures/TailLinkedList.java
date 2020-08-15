package com.guhpires.datastructures;

/*
* This is a simple implementation of a Singly Linked List with a tail in Java.
* In this particular implementation you can choose between remove/add from/to tail or head, but it
* do not keeps track of the previous element (since it's a singly linked list).
*
* Author: GuhPires
* Visit: https://github.com/GuhPires/data-structures
* ---- Feel completely free to modify this code and give me suggestions! ----
* */

public class TailLinkedList<T> {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public class Node<T> {
        private T data;
        private Node next;
        public Node(T d, Node n) {
            this.data = d;
            this.next = n;
        }

        public T peek() { return this.data; }

        public Node next() { return this.next; }
    }

    public int size() { return this.size; }

    public boolean isEmpty() { return size() == 0; }

    public void addToHead(T element) {
        Node node = new Node(element, this.head);
        this.head = node;
        if(isEmpty()) this.tail = node;
        this.size++;
    }

    public void addToTail(T element) {
        Node node = new Node(element, null);
        if(isEmpty()){
            this.tail = this.head = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void removeFirst() {
        if(isEmpty()) throw new RuntimeException("The Linked List is empty.");
        Node deleted = this.head;
        if(size() == 1) {
            this.head = this.tail = null;
        } else {
            this.head = deleted.next;
        }
        deleted = null;
        this.size--;
    }

    public void removeLast() {
        if(isEmpty()) throw new RuntimeException("The Linked List is empty.");
        Node deleted = this.tail;
        Node node = this.head;
        Node prev = node;

        if(size() == 1) {
            this.head = this.tail = null;
        } else {
            while(node.next() != null) {
                prev = node;
                node = node.next();
            }
            this.tail = prev;
            this.tail.next = null;
            deleted = null;
        }
        this.size--;
    }

    public Node getHead() { return this.head; }

    public Node getTail() { return this.tail; }

    public void print() {
        Node node = this.head;
        while(node != null) {
            System.out.print(" -> " + node.data);
            if(node == this.head) System.out.print(" (HEAD)");
            if(node == this.tail) System.out.print(" (TAIL)");
            node = node.next;
        }
        System.out.println("");
    }
}
