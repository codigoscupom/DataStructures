package com.company.test;

import com.company.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 12/20/14.
 */
public class TestList {
    @Test
    public void testInsertHead() {
        List l1 = new List();
        l1.insertHead(4);
        assertEquals(4, l1.head().value());
        l1.insertHead(5);
        assertEquals(5, l1.head().value());
    }

    @Test
    public void listSize() {
        List l1 = new List();
        assertEquals(0, l1.size());
        addFiveElements(l1);
        assertEquals(5, l1.size());
    }

    @Test
    public void toArray() {
        List l1 = new List();
        addFiveElements(l1);
        assertArrayEquals(new int[]{1,2,3,4,5}, l1.toArray());
    }

    @Test
    public void tail() {
        List l1 = new List();
        l1.insertHead(5);
        assertEquals(5, l1.tail().value());
        l1.insertHead(100);
        assertEquals(5, l1.tail().value());
    }

    @Test
    public void deleteFromHead() {
        List l1 = new List();
        l1.insertHead(4);
        l1.deleteFromHead();
        assertEquals(null, l1.head());
        addFiveElements(l1);
        l1.deleteFromHead();
        assertEquals(2, l1.head().value);
        assertEquals(4, l1.size());
        l1.deleteFromHead();
        assertEquals(3, l1.head().value);
        assertEquals(3, l1.size());

    }

    @Test
    public void deleteFromTail() {
        List l1 = new List();
        addFiveElements(l1);
        l1.print();
        l1.deleteFromTail();
        assertEquals(4, l1.tail().value());
    }

    @Test
    public void deleteFromPosition() {
        List l1 = new List();
        addFiveElements(l1);
        l1.deleteFromPosition(1);
        assertEquals(2, l1.head().value);
        assertEquals(4, l1.size());
        l1.deleteFromPosition(4);
        assertEquals(4, l1.tail().value);
        assertEquals(3, l1.size());
        List l2 = new List();
        addFiveElements(l2);
        l2.deleteFromPosition(3);
        assertArrayEquals(new int[]{1, 2, 4, 5}, l2.toArray());
    }

    private void addFiveElements(List l1) {
        for (int i = 5; i > 0; i--) {
            l1.insertHead(i);
        }
    }
}
