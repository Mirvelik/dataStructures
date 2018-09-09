package com.vadim.lopatka.dataStructures.bag;

public class BagOnLinks<T> implements Bag<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public BagOnLinks() {
    }

    @Override
    public void add(T item) {

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
        return 0;
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

    private class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;
    }
}
