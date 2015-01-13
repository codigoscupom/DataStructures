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

    public static List createList(Integer... elements) {
        List list = new List();
        for (Integer element : elements) {
            list.insertTail(element);
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

    public static List merge(List l1, List l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        List l3 = new List();
        Node aux1 = l1.head;
        Node aux2 = l2.head;

        while (aux1 != null && aux2 != null) {
            if (aux1.value < aux2.value) {
                l3.insertTail(aux1.value);
                aux1 = aux1.next;
            } else {
                l3.insertTail(aux2.value);
                aux2 = aux2.next;
            }
        }

        while (aux1 != null) {
            l3.insertTail(aux1.value);
            aux1 = aux1.next;
        }

        while (aux2 != null) {
            l3.insertTail(aux2.value);
            aux2 = aux2.next;
        }

        return l3;
    }



//essa porra aqui funciona
   /* public static Node swapPairs(Node head) {
        if (head == null) return null;
        if (head.next == null) return head;
        Node previous = null;
        Node current = head;
        Node runner = head.next;
        while (runner != null && runner != current) {
            current.next = runner.next;
            runner.next = current;
            if (previous == null) {
                previous = runner;
                head = previous;
                previous = previous.next;
            } else {
                previous.next = runner;
                //previous = previous.next.next;
                previous = current;
            }
            current = current.next;
            if (current == null) break;
           // runner = runner.next.next.next;
            runner = current.next;

        }
        return head;
    }*/

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) return head;
        Node current = head;
        Node prev = null;
        Node next = current.next;
        while (next != null) {
            current.next = next.next;
            next.next = current;
            if (prev == null) {
                prev = next;
                head = prev;
            } else {
                prev.next = next;
            }
            prev = current;
            current = current.next;
            if (current == null) {
                break;
            }
            next = current.next;
        }
        return head;
    }
}

