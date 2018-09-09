package com.vadim.lopatka.dataStructures.bag;

/**
 *
 * @param <T>
 */
public interface Bag<T> {
    /**
     * insert item in the Bag
     *
     * @param item
     */
    void add(T item);

    /**
     * remove all items from this Bag
     */
    void clear();

    /**
     * Returns true if this bag contains the specified element and false otherwise.
     *
     * @param item
     * @return true if this bag contains the @param{item} or false otherwise.
     */
    boolean contains(T item);

    /**
     * Returns the total number of elements in this bag.
     * (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} size is 6)
     *
     * @return the total number of elements in this bag.
     */
    int size();

    /**
     * Returns the distinct number of elements in this bag.
     * (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} distinctSize is 4)
     *
     * @return the distinct number of elements in this bag.
     */
    int distinctSize();

    /**
     * Returns the number of this item in this bag.
     * (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} elementsize(‘be’) is 2)
     *
     * @param item
     * @return the number of the item in this bag.
     */
    int elementSize(T item);

    /**
     * Check the collection for emptiness
     *
     * @return true if this collection contains no elements.
     */
    boolean isEmpty();

    /**
     * Removes a single instance of item from this bag
     *
     * @param item
     * @return true if the item was deleted otherwise returns false.
     */
    boolean remove(T item);
}
