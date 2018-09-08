package com.vadim.lopatka.dataStructures.bag;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagOnArrayTest {

    private BagOnArray<String> bag;

    @Before
    public void setUp() throws Exception {
        bag = new BagOnArray<>();
    }

    @Test
    public void add() {
        int elements = 250;
        for (int i = 0; i < elements; i++)
            bag.add("_"+i);

        System.out.println(bag);
        Assert.assertEquals(elements, bag.size());
    }

    @Test
    public void clear() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void size() {
    }

    @Test
    public void distinctSize() {
    }

    @Test
    public void elementSize() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void iterator() {
    }
}