package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.*;

/**
 * Created by neilson on 1/4/15.
 */
public class Problem32 {
    @Test
    public void reverseInPairs() {
        //public static void main(String [] args){
       /* List l1 = ListUtils.createList(1,2,3,4,5,6);
        l1.head = ListUtils.switchNeighborNodes(l1.head);
        l1.toString();*/


        List l2 = ListUtils.createList(1, 2, 3, 4, 5, 6);
        l2.head = ListUtils.swapPairs(l2.head);
        System.out.println(l2.toString());
    }

    @Test
    public void reverseInPairsRecursively() {
       /* List l1 = ListUtils.createList(1,2,3,4,5,6);
        l1.head = ListUtils.switchNeighborNodes(l1.head);
        l1.toString();*/


        List l2 = ListUtils.createList(1, 2, 3, 4, 5, 6);
        l2.head = ListUtils.swapPairsRecursive(l2.head);
        System.out.println(l2.toString());
    }

}
