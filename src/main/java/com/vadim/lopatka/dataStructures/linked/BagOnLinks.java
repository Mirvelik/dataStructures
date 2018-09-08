package com.vadim.lopatka.dataStructures.linked;

import java.util.Iterator;

public class BagOnLinks<R> implements Iterable<R> {
    private int size;
    private Node<R> first;

    public void add(R item) {

    }

    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator<R> iterator() {
        return null;
    }

    private class Node<R> {}

}
