package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by neilson on 1/3/15.
 */
public class Problem31 {
    @Test
    public void merge() {
        List l1 = ListUtils.createList(2, 4, 5, 7, 9);
        List l2 = ListUtils.createList(1, 3, 6, 8, 10);
        List l3 = ListUtils.merge(l1, l2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, l3.toArray());

    }
}
