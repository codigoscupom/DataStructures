package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 1/3/15.
 */
public class Problem29 {
    @Test
    public void evenOrOdd() {
        List l1 = ListUtils.createList(1, 5);
        assertEquals(Boolean.FALSE, l1.isSizeEven());
        List l2 = ListUtils.createList(1, 6);
        assertEquals(Boolean.TRUE, l2.isSizeEven());
    }
}
