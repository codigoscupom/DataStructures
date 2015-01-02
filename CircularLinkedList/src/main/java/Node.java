/**
 * Created by neilson on 12/26/14.
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next=this;
    }
}
