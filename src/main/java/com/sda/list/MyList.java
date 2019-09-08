package com.sda.list;

/**
 */
public interface MyList<T> {
    /**
     * @param element list element to be added.
     */
    void add(ListElement element);

    /**
     *
     * @param element
     */
    void remove(ListElement<T> element);

    /**
     *
     * @param index
     * @return
     */
    ListElement<T> get(int index);

    /**
     * Print all elements of the list.
     */
    void printAll();

    /**
     * @return list size.
     */
    int size();
}
