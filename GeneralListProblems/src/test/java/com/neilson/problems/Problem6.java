package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.singlelinkedlist.Node;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by neilson on 12/29/14.
 * Check for loops in a linked list
 */
public class Problem6 {
    @Test
    public void loopInAList() {
        List listWithLoop = ListUtils.createListWithLoop(3,3);
        assertEquals(Boolean.TRUE, listWithLoop.containsLoop());
        List regularList =  ListUtils.createRegularLinkedList(4);
        assertEquals(Boolean.FALSE, regularList.containsLoop());
    }

    @Test
    public void loopInAListV2() {
        List listWithLoop = ListUtils.createListWithLoop(3,3);
        assertEquals(Boolean.TRUE, listWithLoop.containsLoopV2());
        List regularList =  ListUtils.createRegularLinkedList(4);
        assertEquals(Boolean.FALSE, regularList.containsLoopV2());
    }

    @Test
    public void findBeginOfLoop() {
        List listWithLoop = ListUtils.createListWithLoop(3,3);
        assertEquals(new Integer(-3), listWithLoop.findBeginOfLoop().value);

    }

    @Test
    public void countElementsOnLoop2() {
        List listWithLoop = ListUtils.createListWithLoop(5,5);
        assertEquals(new Integer(5), listWithLoop.countElementsOnLoop());
    }
}
