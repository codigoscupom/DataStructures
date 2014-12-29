package com.neilson.commons.utils;

import com.neilson.commons.singlelinkedlist.List;

/**
 * Created by neilson on 12/29/14.
 */
public class ListUtils {
    public static void insertNElements(List list, int n) {
        for (int i = 1; i < n; i++) {
            list.insertHead(i);
        }
    }
}
