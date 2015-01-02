import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 12/26/14.
 */
public class CLListTest {
    @Test
    public void insertNodeTail() {
        CLList list = new CLList();
        insertNElements(list, 5);
        list.print();
        assertEquals(1, 1);
    }

    @Test
    public void count() {
        CLList list1 = new CLList();
        insertNElements(list1, 0);
        assertEquals(0, list1.count());
        CLList list2 = new CLList();
        insertNElements(list2, 1);
        assertEquals(1, list2.count());
        CLList list3 = new CLList();
        insertNElements(list3, 3);
        assertEquals(3, list3.count());
    }

    @Test
    public void insertNodeHead() {
        CLList list = new CLList();
        insertNElementsHead(list, 5);
        assertArrayEquals(new int[]{4,3,2,1,0}, list.toArray());

    }

    @Test
    public void deleteFromHead(){
        CLList list = new CLList();
        insertNElements(list, 5);
        list.deleteFromHead();
        assertArrayEquals(new int[]{1,2,3,4}, list.toArray());
    }

    @Test
    public void deleteFromTail(){
        CLList list = new CLList();
        insertNElements(list, 5);
        list.deleteFromTail();
        assertArrayEquals(new int[]{0,1,2,3}, list.toArray());
    }

    private void insertNElements(CLList list, int numElements) {
        for (int i = 0; i < numElements; i++) {
            list.insertNodeTail(i);
        }

    }

    private void insertNElementsHead(CLList list, int numElements) {
        for (int i = 0; i < numElements; i++) {
            list.insertNodeHead(i);
        }

    }
}
