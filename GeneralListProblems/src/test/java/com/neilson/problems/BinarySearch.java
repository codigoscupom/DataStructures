package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by neilson on 1/4/15.
 */
public class BinarySearch {
    @Test
    public void binarySearch(){
        List l1 = ListUtils.createList(1, 2, 4, 5, 6, 7, 8, 10, 11);
        Boolean containsElement = l1.binarySearch(l1.head, l1.tail(), 4);
        assertTrue(containsElement);
        containsElement = l1.binarySearch(l1.head, l1.tail(), 3);
        assertFalse(containsElement);

        List l2 = ListUtils.createList(1, 2, 4, 5, 6, 7, 8, 10);
        containsElement = l2.binarySearch(l2.head, l1.tail(), 7);
        assertTrue(containsElement);

        containsElement = l2.binarySearch(l2.head, l1.tail(), 3);
        assertFalse(containsElement);

    }

}
