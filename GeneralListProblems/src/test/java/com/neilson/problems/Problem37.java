package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.*;

/**
 * Created by neilson on 1/14/15.
 */
public class Problem37 {
    @Test
    public void testPalindrome() {
        List l1 = ListUtils.createList(1, 2, 3, 2, 1);
        Assert.assertEquals(Boolean.TRUE, ListUtils.isPalindrome(l1));

        List l2 = ListUtils.createList(1, 2, 3, 2, 1, 2);

        Assert.assertEquals(Boolean.FALSE, ListUtils.isPalindrome(l2));

    }
}
