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

    // Creating the node
    public class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T d, Node n) {
            this.data = d;
            this.next = n;
        }

        // Retrieve the Node's data
        // Time complexity: O(1)
        public T peek() { return this.data; }

        // Pointer to the next Node
        // Time complexity: O(1)
        public Node next() { return this.next; }
    }

    // Returns the Linked List size
    // Time complexity: O(1)
    public int size() { return this.size; }

    // Returns if the Linked List is empty
    // Time complexity: O(1)
    public boolean isEmpty() { return size() == 0; }

    // Add new Node as the new head (add to the head)
    // Time complexity: O(1)
    public void add(T element) {
        Node node = new Node(element, this.head);
        this.head = node;
        this.size++;
    }

    // Delete the head Node
    // Time complexity: O(1)
    public void remove() {
        if(isEmpty()) throw new RuntimeException("The Linked List is empty.");
        Node deleted = this.head;
        this.head = deleted.next;
        deleted = null;
        this.size--;
    }

    // Returns the Linked List's head
    // Time complexity: O(1)
    public Node getHead() { return this.head; }

    // Prints the Linked List's Nodes
    // Time complexity: O(n)
    public void print() {
        Node node = this.head;
        while(node != null) {
            System.out.print(" -> " + node.data);
            node = node.next;
        }
        System.out.println("");
    }
}
