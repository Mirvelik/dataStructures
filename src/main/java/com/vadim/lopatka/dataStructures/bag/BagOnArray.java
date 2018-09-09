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
        if (size == store.length)
            store = expandStore();

        store[size] = item;
        size++;
    }

    private Object[] expandStore() {
        Object[] biggerStore = new Object[store.length * 2];
        return copyArrays(store, biggerStore);
    }

    private Object[] copyArrays(Object[] from, Object[] to) {
        for (int i = 0; i < from.length; i++)
            to[i] = from[i];

        return to;
    }

    @Override
    public void clear() {
        store = new Object[defaultSize];
        size = 0;
    }

    @Override
    public boolean contains(T item) {
        if (item != null) {
            for (Object storeElement : store) {
                if (storeElement.equals(item))
                    return true;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int distinctSize() {
        int count = 0;

        for (int i = 0; i < store.length - 1; i++) {
            for (int j = i + 1; j < store.length && store[i] != store[j]; j++) {
                if (j == store.length - 1) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public int elementSize(T item) {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (store[i].equals(item))
                count++;

        return count;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(store[i])) {
                for (int j = i; j <size; j++) {
                    if (store[j + 1] != null) {
                        store[j] = store[j + 1];
                    }
                }
                size--;

                store[size] = null; //fix last
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "BagOnArray{" +
                "store=" + Arrays.toString(store) +
                '}';
    }
}
