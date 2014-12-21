package com.company;

/**
 * Created by neilson on 11/13/14.
 */
public class Node {
    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node next() {
        return next;
    }

    public int value() {
        return value;
    }
}
