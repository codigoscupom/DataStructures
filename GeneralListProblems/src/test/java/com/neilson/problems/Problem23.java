package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.singlelinkedlist.Node;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 1/2/15.
 */
public class Problem23 {
    /**
     * L1 = 10, 11, 12, 13, 14, 1, 2, 3, 4
     * L2 = 7, 8, 9, 1, 2, 3, 4
     */
    @Test
    public void testListIntersection() {
        List insersection = ListUtils.createList(0, 4);
        List l1 = ListUtils.createList(7, 9);
        List l2 = ListUtils.createList(13, 17);
        l1.tail().next = insersection.head;
        l2.tail().next = insersection.head;
        assertArrayEquals(new int[]{7, 8, 9, 0, 1, 2, 3, 4}, l1.toArray());
        assertArrayEquals(new int[]{13, 14, 15, 16, 17, 0, 1, 2, 3, 4}, l2.toArray());

        //calculate the size of each list
        Integer sizeL1 = l1.count();
        Integer sizeL2 = l2.count();
        Integer difference = 0;

        if (sizeL1 < sizeL2) {
            Node temp = l1.head;
            l1.head = l2.head;
            l2.head = temp;
            difference = sizeL2 - sizeL1;
        } else {
            difference = sizeL1 - sizeL2;
        }

        int index = 0;
        Node l1Pointer = l1.head;
        Node l2Pointer = l2.head;

        while (index < difference) {
            l1Pointer = l1Pointer.next;
            index++;
        }

        Integer intersection = 0;
        while (l1Pointer != null && l2Pointer != null) {
            if (l1Pointer.value == l2Pointer.value) {
                intersection = l1Pointer.value;
                break;
            }
            l1Pointer = l1Pointer.next;
            l2Pointer = l2Pointer.next;
        }
        assertEquals(new Integer(0), intersection);
    }
}
