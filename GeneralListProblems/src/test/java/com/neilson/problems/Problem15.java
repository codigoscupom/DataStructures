package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.singlelinkedlist.Node;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 1/1/15.
 * Insert a node in a sorted linked list
 */
public class Problem15 {
    @Test
    public void insertNodeSortedList() {
        List list = ListUtils.createList(3);
        list.insertElementInOrder(10).insertElementInOrder(15).insertElementInOrder(12);

        assertArrayEquals(new int[]{1, 2, 3, 10, 12, 15}, list.toArray());

    }

    @Test
    public void testCount() {
        List list = ListUtils.createList(3);
        assertEquals(new Integer(3), list.count());

    }

    @Test
    public void invertList() {
        List list = ListUtils.createList(5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, list.toArray());
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, list.invert().toArray());
    }

    @Test
    public void invertRecursively() {
        List list = ListUtils.createList(5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, list.toArray());
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, list.invertRecursively().toArray());
    }

    @Test
    public void invertRecursively2() {
        List list = ListUtils.createList(5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, list.toArray());
        Node inversedHead = list.getInversedHead(list.head);
        System.out.println();

    }
}
