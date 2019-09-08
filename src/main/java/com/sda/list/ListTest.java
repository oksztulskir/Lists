package com.sda.list;

/**
 */
public class ListTest {
    public static void main(String[] args) {
        MyLinkedList<Country> linkedList = new MyLinkedList<>();
        ListElement<Country> element1 = new ListElement<>(new Country("Poland", "PL"));
        ListElement<Country> element2 = new ListElement<>(new Country("England", "EN"));
        ListElement<Country> element3 = new ListElement<>(new Country("Germany", "DE"));
        ListElement<Country> element4 = new ListElement<>(new Country("Russia", "RU"));
        ListElement<Country> element5 = new ListElement<>(new Country("Ukraine", "UA"));

        linkedList.add(element1);
        linkedList.add(element2);
        linkedList.add(element3);
        linkedList.add(element4);
        linkedList.add(element5);

        System.out.println("List size: " + linkedList.size());
        linkedList.printAll();

        System.out.println("Removing: " + element1.getValue());
        linkedList.remove(element1);
        linkedList.printAll();

        System.out.println("Removing: " + element4.getValue());
        linkedList.remove(element4);
        linkedList.printAll();

        System.out.println("Removing: " + element5.getValue());
        linkedList.remove(element5);
        linkedList.printAll();

        System.out.println("Removing: " + element3.getValue());
        linkedList.remove(element3);
        linkedList.printAll();

        System.out.println("Removing: " + element2.getValue());
        linkedList.remove(element2);
        linkedList.printAll();

        linkedList.add(element3);
        linkedList.printAll();

        linkedList.add(element2);
        linkedList.printAll();

    }
}
