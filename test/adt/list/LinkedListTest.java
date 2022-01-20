package adt.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<Integer> list = new LinkedList<>();

    @BeforeEach
    void reset() {
        list = new LinkedList<>();
    }

    @Test
    void add() {
        list.add(5);
        list.add(15);

        assertEquals(2, list.size());
    }

    @Test
    void addToFront() {
        list.addToFront(99);

        assertEquals(99, list.get(0));
    }

    @Test
    void testAdd() {
    }

    @Test
    void contains() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void get() {
    }

    @Test
    void remove() {
        list.add(1);
        list.add(2);
        list.add(18);

        assertEquals(3, list.size());

        int val = list.remove(1);

        assertEquals(2, list.size());
        assertEquals(2, val);

    }
}