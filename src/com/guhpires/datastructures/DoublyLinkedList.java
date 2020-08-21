package com.guhpires.datastructures;

/*
 * This is a simple implementation of a Doubly Linked List in Java.
 * In this particular implementation the default addition and deletion are done into the head.
 *
 * Author: GuhPires
 * Visit: https://github.com/GuhPires/data-structures
 * ---- Feel completely free to modify this code and give me suggestions! ----
 * */

public class DoublyLinkedList<T> {
    private int size = 0;
    private Node head = null, tail = null;

    // Creating the node
    public class Node<T> {
        private T data;
        private Node<T> next, prev;
        public Node(T d, Node n, Node p) {
            this.data = d;
            this.next = n;
            this.prev = p;
        }

        // Retrieve the Node's data
        // Time complexity: O(1)
        public T peek() { return this.data; }

        // Pointer to the next Node
        // Time complexity: O(1)
        public Node next() { return this.next; }

        // Pointer to the previous Node
        // Time complexity: O(1)
        public Node prev() { return this.prev; }
    }

    // Returns the Linked List size
    // Time complexity: O(1)
    public int size() { return this.size; }

    // Returns if the Linked List is empty
    // Time complexity: O(1)
    public boolean isEmpty() { return size() == 0; }

    // Add new Node as the new head (add to the head)
    // Time complexity: O(1)
    public void addToHead(T element) {
        Node node = new Node(element, this.head, null);
        this.head = node;
        if(isEmpty()) this.tail = node;
        this.size++;
    }

    // Add new Node as the new Tail (add to the tail)
    // Time complexity: O(1)
    public void addToTail(T element) {
        Node node = new Node(element, null, this.tail);
        if(isEmpty()){
            this.tail = this.head = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    // Delete the head Node
    // Time complexity: O(1)
    public void removeFirst() {
        if(isEmpty()) throw new RuntimeException("The Doubly Linked List is empty.");
        Node deleted = this.head;
        if(size() == 1) {
            this.head = this.tail = null;
        } else {
            this.head = deleted.next;
            this.head.prev = null;
        }
        deleted = null;
        this.size--;
    }

    // Delete the tail Node
    // Time complexity: O(1)
    public void removeLast() {
        if(isEmpty()) throw new RuntimeException("The Doubly Linked List is empty.");
        Node deleted = this.tail;
        if(size() == 1) {
            this.head = this.tail = null;
        } else {
            this.tail = deleted.prev;
            this.tail.next = null;
        }
        deleted = null;
        this.size--;
    }

    // Returns the Linked List's head
    // Time complexity: O(1)
    public Node getHead() { return this.head; }

    // Returns the Linked List's tail
    // Time complexity: O(1)
    public Node getTail() { return this.tail; }

    // Prints the Linked List's Nodes
    // Time complexity: O(n)
    public void print() {
        Node node = this.head;
        while(node != null) {
            System.out.print((node != this.head ? " <-> " : "") + node.data);
            if(node == this.head) System.out.print(" (HEAD)");
            if(node == this.tail) System.out.print(" (TAIL)");
            node = node.next;
        }
        System.out.println("");
    }
}
