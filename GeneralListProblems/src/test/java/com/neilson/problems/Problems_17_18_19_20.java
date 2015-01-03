package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;
import org.neilson.problem1.Stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 1/2/15.
 */
public class Problems_17_18_19_20 {
    @Test
    public void testListIntersection() {
        List insersection = ListUtils.createList(0, 4);
        List l1 = ListUtils.createList(7, 9);
        List l2 = ListUtils.createList(13, 17);
        l1.tail().next = insersection.head;
        l2.tail().next = insersection.head;
        assertArrayEquals(new int[]{7, 8, 9, 0, 1, 2, 3, 4}, l1.toArray());
        assertArrayEquals(new int[]{13, 14, 15, 16, 17, 0, 1, 2, 3, 4}, l2.toArray());

        Stack stackL1 = new Stack();
        Stack stackL2 = new Stack();
        int[] list1 = l1.toArray();
        int[] list2 = l2.toArray();

        for (int i = 0; i < list1.length; i++) {
            stackL1.push(list1[i]);
        }

        for (int i = 0; i < list2.length; i++) {
            stackL2.push(list2[i]);
        }

        Integer numL1 = stackL1.pop();
        Integer numL2 = stackL2.pop();

        while (!stackL1.isEmpty() && !stackL2.isEmpty()) {
            numL1 = stackL1.pop();
            numL2 = stackL2.pop();
            if (numL1 != numL2) {
                break;
            }
        }
        assertEquals(new Integer(9), numL1);
        assertEquals(new Integer(17), numL2);
    }
}
