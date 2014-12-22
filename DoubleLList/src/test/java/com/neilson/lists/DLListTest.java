package com.neilson.lists;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 12/21/14.
 */
public class DLListTest {

    @Test
    public void testCount() {
        DList list = new DList();
        insertNElements(list, 5);
        assertEquals(5, list.countElements());
    }

    @Test
    public void insertHead() {
        DList list = new DList();
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        assertArrayEquals(new int[]{3, 2, 1}, list.toArray());
    }

    @Test
    public void insertTail() {
        DList list = new DList();
        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(3);
        assertArrayEquals(new int[]{1, 2, 3}, list.toArray());
    }

    @Test
    public void comeAndGo() {
        DList list = new DList();
        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(4);
        assertArrayEquals(new int[]{1,2,3,4,3,2,1}, list.comeAndGo());
    }

    public void insertNElements(DList list, int numElements) {
        for (int i = numElements; i > 0; i--) {
            list.insertHead(i);
        }
    }
}
