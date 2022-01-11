package adt.list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynamicListTest {

    IList<Integer> list = new DynamicList<>(10);

    @BeforeEach
    void setup() {
        for (int i = 0; i < 8; i++) {
            list.add(i);
        }
    }

    @AfterEach
    void reset() {
        list = new DynamicList<>(10);
    }

    @Test
    void add_test() {
        list.add(9);
        list.add(10);
        list.add(11);

        Assertions.assertEquals(11, list.size());
    }

    @Test
    void addAtIndex_test() {
        list.add(69, 4);

        Assertions.assertEquals(9, list.size());
        Assertions.assertEquals(69, list.get(4));
    }

    @Test
    void contains_test() {
        list.add(99);
        list.add(49);
        list.add(69);

        Assertions.assertEquals(true, list.contains(99));
    }

    @Test
    void size_test() {
        list.add(99);
        list.add(49);
        list.add(69);

        Assertions.assertEquals(11, list.size());
    }

    @Test
    void isEmpty_test() {
    }

    @Test
    void get_test() {
        Assertions.assertEquals(7, list.get(7));
    }

    @Test
    void remove_test() {
        list.add(8);
        list.add(9);

        Assertions.assertEquals(10, list.size());
        list.remove(5);
        Assertions.assertEquals(9, list.size());

        int idx5 = list.get(5);
        Assertions.assertEquals(6, idx5);

    }
}