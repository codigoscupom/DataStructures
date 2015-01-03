package org.neilson.problem1;

import com.neilson.commons.singlelinkedlist.List;

/**
 * Created by neilson on 12/29/14.
 */
public class Stack {
    public List linkedList;

    public Stack() {
        linkedList = new List();
    }

    public Boolean isEmpty() {
        return linkedList.head == null;
    }

    public void push(Integer value) {
        this.linkedList.insertHead(value);
    }

    public Integer pop() {
        return this.linkedList.removeFromHead();
    }
}
