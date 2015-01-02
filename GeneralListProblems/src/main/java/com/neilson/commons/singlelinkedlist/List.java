package com.neilson.commons.singlelinkedlist;


import java.util.HashSet;

/**
 * Created by neilson on 12/29/14.
 */
public class List {
    public Node head;

    public void insertHead(int value) {
        if (this.head == null) {
            head = new Node(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public Integer removeFromHead() {
        if (head == null) return null;
        int value = head.value;
        Node temp = head;
        head = head.next;
        temp.next = null;
        temp = null;
        return value;

    }

    public Integer findNthFromEnd(Integer nth) throws Exception {
        if (this.head == null) return null;
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (nth > count) {
            throw new Exception("fewer elements in the list.");
        }
        int aux = 1;
        temp = head;
        while (aux < count - nth + 1) {
            temp = temp.next;
            aux++;
        }
        return temp.value;
    }


    public Integer findNthFromEndSingleScan(Integer nth) {
        if (head == null) return null;
        Node temp = head;
        Node prev = head;
        int count = 1;
        while (count < nth) {
            temp = temp.next;
            count++;
        }
        while (temp.next != null) {
            temp = temp.next;
            prev = prev.next;
        }
        return prev.value;
    }

    public Node tail() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null && temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }

    public Boolean containsLoop() {
        if (head == null) return Boolean.FALSE;
        HashSet<String> set = new HashSet<String>();
        Node temp = head;
        while (temp.next != null) {
            if (set.add(temp.toString())) {
                temp = temp.next;
            } else {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;


    }

    public Boolean containsLoopV2() {
        Node slow = head;
        Node fast = head;
        while (fast != null && slow != null) {
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            if (fast == slow) {
                return true;
            }
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            if (fast == slow) {
                return true;
            }
            slow = slow.next;

        }
        return Boolean.FALSE;
    }

    public Node findBeginOfLoop() {
        Node slow = head;
        Node fast = head;
        Boolean hasLoop = Boolean.FALSE;
        while (slow != null && fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            if (fast == slow) {
                hasLoop = Boolean.TRUE;
                break;
            }
            fast = fast.next;
            if (fast == null) {
                break;
            }
            if (fast == slow) {
                hasLoop = Boolean.TRUE;
                break;
            }
            slow = slow.next;
        }
        if (hasLoop) {
            slow = head.next;
            while (slow.value != fast.value) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public Integer countElementsOnLoop() {
        Node slow = head;
        Node fast = head;
        Boolean hasLoop = Boolean.FALSE;
        while (slow != null && fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            if (fast == slow) {
                hasLoop = Boolean.TRUE;
                break;
            }
            fast = fast.next;
            if (fast == null) {
                break;
            }
            if (fast == slow) {
                hasLoop = Boolean.TRUE;
                break;
            }
            slow = slow.next;
        }
        Integer count = 1;
        if (hasLoop) {
            fast = fast.next;
            while (slow.value != fast.value) {
                fast = fast.next;
                count++;
            }
        }
        return count;
    }

    public List insertElementInOrder(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return this;
        }
        Node temp = head;
        Node prev = head;
        while (temp != null && temp.value < value) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = node;
        node.next = temp;
        return this;
    }

    public Boolean contains(Integer element) {
        if (head == null) return false;
        Node temp = head;
        while (temp != null) {
            if (temp.value == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int[] toArray() {
        if (head == null) return null;
        int[] array = new int[this.count()];
        Node temp = head;
        int index = 0;
        while (temp != null) {
            array[index] = temp.value;
            index++;
            temp = temp.next;
        }
        return array;
    }

    public Integer count() {
        if (head == null) return 0;
        Node temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public List invert() {
        if (head == null) return null;
        Node temp = null;
        Node nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = temp;
            temp = head;
            head = nextNode;
        }
        head = temp;
        return this;
    }

    public List invertRecursively() {
        this.head = getInversedHead(this.head);
        return this;
    }

    public Node getInversedHead(Node list){
        if (list == null) return null;
        if (list.next == null) return list;
        Node secondElement = list.next;
        list.next = null;
        Node reversedList = getInversedHead(secondElement);
        reversedList.next = list;
        return reversedList;
    }
}
