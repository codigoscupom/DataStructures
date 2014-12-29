package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by neilson on 12/29/14.
 */
public class Problem2 {
    @Test
    public void testNthElement() throws Exception {
        List l1 = new List();
        ListUtils.insertNElements(l1, 6);
        assertEquals(new Integer(3),l1.findNthFromEnd(4));
    }

}
