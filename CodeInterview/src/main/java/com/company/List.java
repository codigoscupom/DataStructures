package com.company;

/**
 * Created by neilson on 11/13/14.
 */
public class List {

    Node head;

    //I don't want to maintain a pointer to the tail, so I have a function to calculate it every time I need it.
    public Node tail() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    /*
    Add element i to the list on position pos
    If position == 0, adds to the head
     */
    public void add(int pos, int value) {
        assert (pos >= 0);

        if (head == null) {
            head = new Node(value);
        } else {
            int j = 1;
            Node temp = head;
            Node previous = temp;
            while (j < pos && temp != null) {
                previous = temp;
                j++;
                temp = temp.next();
            }
            Node node = new Node(value);
            previous.next = node;
            node.next = temp;
        }
    }

    public void insertHead(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node node = new Node(value);
            node.next = head;
            head = node;
        }
    }

    public void insertTail(int value) {
        Node temp = head;
        while (temp.next() != null) {
            temp = temp.next();
        }
        Node node = new Node(value);
        temp.next = node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value());
            temp = temp.next();
        }
    }

    public Node head() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int size() {
        if (head != null) {
            Node temp = head;
            int size = 1;
            while (temp.next != null) {
                size++;
                temp = temp.next;
            }
            return size;
        }
        return 0;
    }

    public void deleteFromHead() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        temp.value = 0;
        temp = null;
    }

    public void deleteFromTail() {
        Node prev = head;
        Node tail = head;
        while (tail.next != null) {
            prev = tail;
            tail = tail.next;
        }
        tail = prev;
        tail.next = null;
    }

    public void deleteFromPosition(int position) {
        if (position == 1) {
            this.deleteFromHead();
            return;
        }

        if (position == this.size()) {
            this.deleteFromTail();
            return;
        }
        Node prev = head;
        Node temp = head;
        int i = 1;
        while (temp != null && i < position) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        temp.next = null;
        temp = null;
    }


    public int[] toArray() {
        int[] result = new int[this.size()];
        Node temp = head;
        int i = 0;
        while (temp != null) {
            result[i] = temp.value();
            i++;
            temp = temp.next;
        }
        return result;
    }
}
