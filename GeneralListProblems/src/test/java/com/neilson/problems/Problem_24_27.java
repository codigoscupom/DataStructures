package com.neilson.problems;

import com.neilson.commons.singlelinkedlist.List;
import com.neilson.commons.utils.ListUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by neilson on 1/3/15.
 */
public class Problem_24_27 {
    //Pagar internet GVT
    //Pagar cartao de credito
    @Test
    public void middleEven() {
        List l1 = ListUtils.createList(1, 10);
        assertEquals(new Integer(5), l1.middle().value);
    }

    @Test
    public void middleOdd() {
        List l1 = ListUtils.createList(1, 11);
        assertEquals(new Integer(6), l1.middle().value);
    }

}
