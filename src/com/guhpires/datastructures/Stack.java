package com.guhpires.datastructures;

public class Stack<T> {
    LinkedList<T> items = new LinkedList<>();

    // Adding element to Stack
    // Time complexity: O(1)
    public void push(T data) { items.add(data); }

    // Removing element from Stack
    // Time complexity: O(1)
    public void pop() { items.remove(); }

    // Get the element from the top of the Stack
    // Time complexity: O(1)
    public T peek() { return (T) items.getHead().peek(); }
}
