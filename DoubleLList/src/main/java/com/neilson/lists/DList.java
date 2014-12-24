package com.neilson.lists;

/**
 * Created by neilson on 12/21/14.
 */
public class DList {
    public Node head;

    public int countElements() {
        int count = 0;
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.right;
            }
        }
        return count;
    }

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

    public int[] comeAndGo() {
        int[] completeTurn = new int[2 * countElements() - 1];
        int index = 0;
        if (head != null) {
            Node temp = head;
            while (temp.right != null) {
                completeTurn[index] = temp.value;
                index++;
                temp = temp.right;
            }
            completeTurn[index] = temp.value;
            index++;
            temp = temp.left;
            while (temp != null) {
                completeTurn[index] = temp.value;
                index++;
                temp = temp.left;
            }
        }
        return completeTurn;
    }

    public void insertTail(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node temp = head;
        while (temp.right != null) {
            temp = temp.right;
        }
        Node newNode = new Node(value);
        temp.right = newNode;
        newNode.left = temp;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.right;
        }
    }

    public int[] toArray() {
        int[] array = new int[countElements()];
        Node temp = head;
        int index = 0;
        while (temp != null) {
            array[index] = temp.value;
            temp = temp.right;
            index++;
        }
        return array;
    }

    public void deleteFromHead() {
        if (head == null) return;
        Node temp = head.right;
        temp.left = null;
        head.right = null;
        head = temp;
    }

    public void deleteFromTail() {
        if (head == null) return;
        Node temp = head;
        while (temp.right != null) {
            temp = temp.right;
        }
        Node beforeLast = temp.left;
        beforeLast.right = null;
        temp.left = null;
        temp = null;
    }

    public void deleteFromPosition(int position) {
        if(head == null) {
            return;
        }

        if(position == 1) {
            deleteFromHead();
            return;
        }

        if(position == this.countElements()) {
            deleteFromTail();
            return;
        }
        Node temp = head;
        Node prev = head;
        int aux = 1;
        while(temp !=null && aux < position){
            prev = temp;
            temp = temp.right;
            aux++;
        }

        Node next = temp.right;
        prev.right=next;
        next.left=prev;
        temp.right=null;
        temp.left=null;
        temp = null;
    }
}
