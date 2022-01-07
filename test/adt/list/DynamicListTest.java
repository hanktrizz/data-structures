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
    }

    @Test
    void size_test() {
    }

    @Test
    void isEmpty_test() {
    }

    @Test
    void get_test() {
    }

    @Test
    void remove_test() {
    }
}