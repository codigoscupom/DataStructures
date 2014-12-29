package com.neilson.problems;

import org.junit.Test;
import static org.junit.Assert.*;
import org.neilson.problem1.Stack;

/**
 * Created by neilson on 12/29/14.
 * Implement Stack using Single Linked List;
 */
public class Problem1 {
    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(new Integer(5), stack.pop());
        assertEquals(new Integer(4), stack.pop());
        assertEquals(new Integer(3), stack.pop());
        assertEquals(new Integer(2), stack.pop());
        assertEquals(new Integer(1), stack.pop());
        assertEquals(null, stack.pop());
    }


}
