package com.vadim.lopatka.dataStructures.bag;

import java.util.Arrays;
import java.util.Iterator;

public class BagOnArray<T> implements Bag<T> {
    private static final int defaultSize = 5;
    private Object[] store;
    private int size;

    public BagOnArray() {
        store = new Object[defaultSize];
    }

    @Override
    public void add(T item) {
        if (size == store.length) {
            store = expandStore();
        }

        store[size] = item;
        size++;
    }

    private Object[] expandStore() {
        Object[] biggerStore = new Object[store.length * 2];
        return copyFirstToSecond(store, biggerStore);
    }

    private Object[] copyFirstToSecond(Object[] first, Object[] second) {
        for (int i = 0; i < first.length; i++)
            second[i] = first[i];

        return second;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int distinctSize() {
        return 0;
    }

    @Override
    public int elementSize(T item) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "BagOnArray{" +
                "store=" + Arrays.toString(store) +
                '}';
    }
}
