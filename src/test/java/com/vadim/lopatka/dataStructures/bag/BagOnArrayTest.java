package com.vadim.lopatka.dataStructures.bag;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagOnArrayTest {

    private final static String TO = "to";
    private final static String BE = "be";
    private final static String OR = "or";
    private final static String NOT = "not";
    private Bag<String> bag;

    @Before
    public void setUp() throws Exception {
        bag = new BagOnLinks<>();
        bag.add(TO);
        bag.add(BE);
        bag.add(OR);
        bag.add(NOT);
        bag.add(TO);
        bag.add(BE);
    }

    @Test
    public void add() {
        int initialSize = bag.size();
        int elements = 25;
        for (int i = 0; i < elements; i++)
            bag.add("_" + i);

        Assert.assertEquals(elements + initialSize, bag.size());
    }

    @Test
    public void clear() {
        assertTrue(bag.size() > 0);
        bag.clear();
        Assert.assertEquals(0, bag.size());
    }

    @Test
    public void contains() {
        String testString = "some test string";
        bag.add(testString);

        assertTrue(bag.contains(testString));
    }

    @Test
    public void size() {
        int initialSize = bag.size();
        bag.add(TO);

        Assert.assertEquals(1 + initialSize, bag.size());
    }

    @Test
    public void distinctSize() {
        //to be or not to be - 4 distinct values
        assertEquals(4, bag.distinctSize());
    }

    @Test
    public void elementSize() {
        assertEquals(2, bag.elementSize(TO));
        assertEquals(2, bag.elementSize(BE));
        assertEquals(1, bag.elementSize(OR));
        assertEquals(1, bag.elementSize(NOT));
    }

    @Test
    public void isEmpty() {
        assertFalse(bag.isEmpty());
        bag.clear();
        assertTrue(bag.isEmpty());
    }

    @Test
    public void remove() {
        int initialSize = bag.size();

        assertTrue(bag.remove(TO));
        assertEquals(bag.size(), initialSize - 1);

        System.out.println(bag);
    }

    @Test
    public void removeNotPresentedValue() {
        int initialSize = bag.size();

        assertFalse(bag.remove("someNotPresentedValue"));
        assertEquals(bag.size(), initialSize);

        System.out.println(bag);
    }
}