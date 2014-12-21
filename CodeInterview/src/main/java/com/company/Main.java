package com.company;

public class Main {

    public static void main(String[] args) {
        List l1 = new List();
        l1.insertHead(5);
        l1.insertHead(4);
        l1.insertHead(3);
        l1.insertHead(2);
        l1.insertHead(1);
        l1.insertTail(100);
        l1.add(3, 50);
        l1.add(55,99);
        l1.print();

    }

}
