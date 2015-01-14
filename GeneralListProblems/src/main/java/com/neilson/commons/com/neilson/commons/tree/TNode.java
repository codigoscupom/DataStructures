package com.neilson.commons.com.neilson.commons.tree;

/**
 * Created by neilson on 1/13/15.
 */
public class TNode {

    public Integer value;
    public TNode left;
    public TNode right;

    public TNode(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
