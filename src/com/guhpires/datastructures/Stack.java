package com.guhpires.datastructures;

public class Stack<T> {
    LinkedList<T> items = new LinkedList<>();
    private int size = 0;

    // Returns the Stack size
    // Time complexity: O(1)
    public int size() { return this.size; }

    // Returns if the Stack is empty
    // Time complexity: O(1)
    public boolean isEmpty() { return size() == 0; }

    // Adding element to Stack
    // Time complexity: O(1)
    public void push(T data) {
        items.add(data);
        this.size++;
    }

    // Removing element from Stack
    // Time complexity: O(1)
    public void pop() {
        items.remove();
        this.size--;
    }

    // Get the element from the top of the Stack
    // Time complexity: O(1)
    public T peek() {
        if(isEmpty()) throw new RuntimeException("The Stack is empty.");
        return (T) items.getHead().peek();
    }

    public void print() {
        LinkedList.Node data = items.getHead();
        while(!isEmpty()) {
            System.out.println(" | " + data.peek() + " | ");
            if(data.next() != null) data = data.next();
            else break;
        }
        System.out.println("");
    }
}
