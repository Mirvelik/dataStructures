package com.vadim.lopatka.dataStructures.list;

public class MyLinkedList<V> {
    private int size = 0;
    private Node<V> first;

    public boolean add(V value) {
        first = new Node<>(value,null);
        return true;
    }

    public V get() {
        return first.value;
    }

    /**
     * First in First out FIFO
     * @param <V>
     */
    private class Node<V> {
        private V value;
        private Node<V> next;

        Node(V value, Node<V> next) {
            this.value = value;
            this.next = next;
        }
    }
}
