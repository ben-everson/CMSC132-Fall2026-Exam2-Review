package Tests;

import org.junit.*;

import linkedList.MyLinkedList;

import static org.junit.Assert.*;


public class LinkedListTests {

    @Test
    public void testReversedCopy() {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(9);

        MyLinkedList reversed = list.reversedCopy();

        assertEquals(9, reversed.get(0));
        assertEquals(7, reversed.get(1));
        assertEquals(1, reversed.get(2));
        assertEquals(2, reversed.get(3));
        assertEquals(5, reversed.get(4));

        // Original list should remain unchanged
        assertEquals(5, list.get(0));
        assertEquals(9, list.get(4));

        // Empty list
        MyLinkedList empty = new MyLinkedList();
        assertEquals(0, empty.reversedCopy().size());
    }

    @Test
    public void testReverseInPlace() {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(9);

        list.reverseInPlace();

        assertEquals(9, list.get(0));
        assertEquals(7, list.get(1));
        assertEquals(1, list.get(2));
        assertEquals(2, list.get(3));
        assertEquals(5, list.get(4));

        // Empty list should remain empty
        MyLinkedList empty = new MyLinkedList();
        empty.reverseInPlace();
        assertEquals(0, empty.size());

        // Single-element list should remain unchanged
        MyLinkedList single = new MyLinkedList();
        single.add(42);
        single.reverseInPlace();
        assertEquals(42, single.get(0));
    }
}
