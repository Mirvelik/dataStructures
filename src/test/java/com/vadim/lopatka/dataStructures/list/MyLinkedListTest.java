package com.vadim.lopatka.dataStructures.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    private MyLinkedList<Integer> list;
    @Before
    public void setUp() throws Exception {
        list = new MyLinkedList<>();
    }

    @Test
    public void add() {
        assertTrue(list.add(3));
    }

    @Test
    public void get() {
        Integer val = new Integer(1);
        list.add(val);
        assertEquals(list.get(), val);
    }
}