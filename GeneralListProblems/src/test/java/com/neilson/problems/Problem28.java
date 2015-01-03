package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;

/**
 * Created by neilson on 1/3/15.
 */
public class Problem28 {
    @Test
    public void printFromEnd() {
        List l1 = ListUtils.createList(1,10);
        l1.printFromEnd(l1.head);
    }
}
