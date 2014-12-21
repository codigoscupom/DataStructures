package com.neilson.lists;

/**
 * Created by neilson on 12/21/14.
 */
public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
