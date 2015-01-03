package com.neilson.commons.utils;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.singlelinkedlist.Node;

/**
 * Created by neilson on 12/29/14.
 */
public class ListUtils {
    public static List createList(int numElements) {
        List list = new List();
        //Random random = new Random();i = i - (random.nextInt() % 2 == 0 ? 1 : 2)
        for (int i = numElements; i > 0; i--) {
            list.insertHead(i);
        }
        return list;
    }

    public static List createList(int low, int high) {
        List list = new List();
        //Random random = new Random();i = i - (random.nextInt() % 2 == 0 ? 1 : 2)
        for (int i = high; i >= low; i--) {
            /*if (list.head == null) {
                list.head = list.insertHead(i);
            }*/
            list.insertHead(i);
        }
        return list;
    }

    public static List insertNElements(List list, int n) {
        for (int i = n; i > 0; i--) {
            list.insertHead(i);
        }
        return list;
    }

    public static List createListWithLoop(Integer numElementsRegularList, Integer numElementsCircularList) {
        List regularList = createRegularLinkedList(numElementsRegularList);
        List circularList = createCircularLinkedList(numElementsCircularList);

        concatenate(regularList, circularList);
        return regularList;
    }

    private static List createCircularLinkedList(Integer numElements) {
        List circularList = new List();
        for (int i = -numElements; i < 0; i++) {
            insertNodeCircularList(circularList, i);
        }
        return circularList;
    }

    private static void concatenate(List list, List circularList) {
        Node tail = list.tail();
        tail.next = circularList.head;
    }

    public static List createRegularLinkedList(Integer numElements) {
        List list = new List();
        for (int i = numElements; i > 0; i--) {
            list.insertHead(i);
        }
        return list;
    }

    public static List insertNodeCircularList(List list, Integer value) {
        Node node = new Node(value);
        if (list.head == null) {
            list.head = node;
            node.next = list.head;
        }

        Node tail = list.tail();
        tail.next = node;
        node.next = list.head;
        return list;
    }


    public static List invertRecursively(Node head) {
        List returnList = new List();
        head = getInversedHead(head);
        returnList.head = head;
        return returnList;
    }

    public static Node getInversedHead(Node node) {
        if (node == null || node.next == null) return node;
        Node reversedHead = getInversedHead(node.next);
        Node temp = reversedHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        return reversedHead;
    }

}
