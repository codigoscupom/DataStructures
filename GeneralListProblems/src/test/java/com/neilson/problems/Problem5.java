package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 12/29/14.
 * Problem 5 - find the nth node from the end with a single scan
 */
public class Problem5 {
    @Test
    public void nthElementSingleScan() {
        List list = new List();
        ListUtils.insertNElements(list, 7);
        assertEquals(new Integer(5), list.findNthFromEndSingleScan(3));
    }
}

