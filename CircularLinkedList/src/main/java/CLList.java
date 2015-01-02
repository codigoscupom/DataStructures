/**
 * Created by neilson on 12/26/14.
 */
public class CLList {
    public Node head;


    public CLList() {
    }

    public CLList(int value) {
        this.head = new Node(value);
    }

    public void insertNodeTail(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = head;
        temp.next = node;

    }

    public void insertNodeHead(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        head = node;

    }

    public int count() {
        if (head == null) return 0;

        Node temp = head;
        int count = 0;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        count++;
        return count;
    }

    public void deleteFromHead() {
        if (head == null) return;
        Node temp = head;
        Node aux = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
        aux.next = null;
        aux = null;
    }

    public void deleteFromTail() {
        if (head == null) return;
        Node temp = head;
        Node prev = head;

        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = head;
        temp.next = null;
        temp = null;
    }



    public void print() {
        Node temp = head;
        while (temp.next != head) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public int[] toArray() {
        if (head == null) return new int[0];
        Node temp = head;
        int[] array = new int[this.count()];
        int i = 0;
        while (temp.next != head) {
            array[i] = temp.value;
            i++;
            temp = temp.next;
        }
        array[i] = temp.value;
        return array;
    }
}
