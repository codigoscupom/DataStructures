package com.neilson.commons.singlelinkedlist;

/**
 * Created by neilson on 12/29/14.
 */
public class Node {
    public Integer value;
    public Node next;

    public Node(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
