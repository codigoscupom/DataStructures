package com.neilson.lists;

/**
 * Created by neilson on 12/21/14.
 */
public class List {
    public Node head;

    public void insertHead(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node node = new Node(value);
        node.right = head;
        head.left = node;
        head = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.right;
        }
    }
}
