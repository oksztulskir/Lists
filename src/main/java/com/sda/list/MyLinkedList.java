package com.sda.list;

/**
 */
public class MyLinkedList<T> implements MyList {

    private ListElement<T> head;

    private ListElement<T> tail;

    MyLinkedList() {
        head = null;
        tail = null;
    }

    public void add(ListElement element) {
        if (size() == 0) {
            head = element;
        } else if (size() == 1) {
            head.setNext(element);
        } else {
            ListElement prevTail = tail;
            prevTail.setNext(element);
        }
        tail = element;
    }

    public void remove(ListElement element) {
        if (size() == 0) {
            System.out.println("The list is empty! You cannot remove this.");
            return;
        }

        if (!ifExists(element)) {
            System.out.println("Removing element does not exists!");
            return;
        }

        switch (size()) {
            case 1:
                head = tail = null;
                break;

            case 2:
                if (element.equals(head)) {
                    head = tail;
                } else {
                    head.setNext(null);
                    tail = head;
                }
                break;

                default:
                    if (element.equals(head)) {
                        head = head.getNext();
                    } else if (element.equals(tail)) {
                        removeLast();
                    } else {
                        removeFromInside(element);
                    }

                    break;
        }

        element.setNext(null);

    }

    private void removeFromInside(ListElement element) {
        ListElement previous = head;
        while (previous.getNext() != element) {
            previous = previous.getNext();
        }
        previous.setNext(element.getNext());
    }

    private void removeLast() {
        ListElement previous = head;
        while (previous.getNext() != tail) {
            previous = previous.getNext();
        }
        previous.setNext(null);
        tail = previous;
    }

    public ListElement get(int index) {
        return null;
    }

    public void printAll() {
        if (size() == 0) {
            System.out.println("The list is empty!");
        }
        ListElement element = head;
        while (element != null) {
            System.out.println(element.getValue());
            element = element.getNext();
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        ListElement element = head;
        while (element != null) {
            ++count;
            element = element.getNext();
        }

        return count;
    }

    private boolean ifExists(ListElement element) {
        ListElement current = head;
        while (current != null) {
            if (current.equals(element)) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }
}
