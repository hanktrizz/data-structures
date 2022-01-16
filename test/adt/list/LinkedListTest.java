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
        list.add(99);
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
    }
}