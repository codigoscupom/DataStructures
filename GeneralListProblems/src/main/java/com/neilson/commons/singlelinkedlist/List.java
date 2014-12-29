package com.neilson.commons.singlelinkedlist;


/**
 * Created by neilson on 12/29/14.
 */
public class List {
    public Node head;

    public void insertHead(int value) {
        if (this.head == null) {
            head = new Node(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public Integer removeFromHead() {
        if (head == null) return null;
        int value = head.value;
        Node temp = head;
        head = head.next;
        temp.next = null;
        temp = null;
        return value;

    }

    public Integer findNthFromEnd(int nth) throws Exception {
        if (this.head == null) return null;
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (nth > count) {
            throw new Exception("fewer elements in the list.");
        }
        int aux = 1;
        temp = head;
        while (aux <= count - nth + 1) {
            temp = temp.next;
            aux++;
        }
        return temp.value;
    }
}
