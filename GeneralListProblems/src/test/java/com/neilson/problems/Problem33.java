package com.neilson.problems;

import com.neilson.commons.com.neilson.commons.tree.Tree;
import org.junit.*;

/**
 * Created by neilson on 1/13/15.
 */
public class Problem33 {
    @Test
    public void testTree() {
        Tree t = new Tree();
        t.root = t.insertNode(t.root, 3);
        t.root = t.insertNode(t.root, 2);
        t.root = t.insertNode(t.root, 1);
        t.root = t.insertNode(t.root, 4);
        t.root = t.insertNode(t.root, 5);
        t.root = t.insertNode(t.root, 6);

        t.printPreOrder(t.root);
    }
}
