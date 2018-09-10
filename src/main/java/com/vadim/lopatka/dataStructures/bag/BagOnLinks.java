package com.vadim.lopatka.dataStructures.bag;

public class BagOnLinks<T> implements Bag<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public BagOnLinks() {
    }

    @Override
    public void add(T item) {
        if (size > 0) {
            Node<T> node = new Node<>(last, item, null);
            last.next=node;
            last = node;
        } else {
            Node<T> node = new Node<>(null, item, null);
            first = node;
            last = node;
        }
        size++;
    }

    @Override
    public void clear() {
        first=null;
        last=null;
        size=0;
    }

    @Override
    public boolean contains(T item) {
        if (size > 0) {
            Node<T> buffer = first;
            do {
                if(buffer.item.equals(item))
                    return true;

            } while ()
        }
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

    private class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node( Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
