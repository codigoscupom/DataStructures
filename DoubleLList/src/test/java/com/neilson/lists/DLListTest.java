package com.neilson.lists;

import com.sun.media.sound.DLSInfo;
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
        assertArrayEquals(new int[]{1, 2, 3, 4, 3, 2, 1}, list.comeAndGo());
    }

    @Test
    public void deleteFromHead() {
        DList list = new DList();
        insertNElements(list, 5);
        list.deleteFromHead();
        assertArrayEquals(new int[]{2, 3, 4, 5, 4, 3, 2}, list.comeAndGo());
    }

    @Test
    public void deleteFromTail(){
        DList list = new DList();
        insertNElements(list, 5);
        list.deleteFromTail();
        assertArrayEquals(new int[]{1,2,3,4,3,2,1}, list.comeAndGo());
    }

    @Test
    public void deleteFromPosition(){
        DList list = new DList();
        insertNElements(list, 7);
        list.deleteFromPosition(4);
        assertArrayEquals(new int[]{1,2,3,5,6,7}, list.toArray());
        list.deleteFromPosition(1);
        assertArrayEquals(new int[]{2,3,5,6,7}, list.toArray());
        list.deleteFromPosition(5);
        assertArrayEquals(new int[]{2,3,5,6}, list.toArray());

    }
    public void insertNElements(DList list, int numElements) {
        for (int i = numElements; i > 0; i--) {
            list.insertHead(i);
        }
    }
}
