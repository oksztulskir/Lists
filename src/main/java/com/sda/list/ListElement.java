package com.sda.list;

import java.util.Objects;

/**
 */
public class ListElement<T> {
    private T value;

    private ListElement next;

    public ListElement(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListElement{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListElement that = (ListElement) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
