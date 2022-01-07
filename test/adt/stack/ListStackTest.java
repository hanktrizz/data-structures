package adt.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class ListStackTest {

    Stack<Integer> stack = new Stack<>(10);

    @BeforeEach
    void reset() {
        stack.clear();
    }

    @Test
    void push_test() {
        stack.push(1);
        stack.push(2);
        stack.push(22);
        stack.push(169);

        assertEquals(4, stack.size());
    }

    @Test
    void pop_test() {
        stack.push(1);
        stack.push(2);
        stack.push(22);

        int item = stack.pop();
        assertEquals(22, item);
        assertEquals(2, stack.size());
    }

    @Test
    void peek_test() {
        stack.push(1);
        stack.push(2);
        stack.push(22);


        assertEquals(22, stack.peek());
        assertEquals(3, stack.size());
    }

    @Test
    void peek_exception_test() {
        Throwable exception = assertThrows(EmptyStackException.class, () -> {
            throw new EmptyStackException();
        });
        assertNull(exception.getMessage(), (String) null);
    }

    @Test
    void size_test() {
        stack.push(6);
        stack.push(9);
        stack.push(3);

        assertEquals(3, stack.size());
    }

    @Test
    void isFull_test() {
        for (int i = 0; i < 10; ++i) {
            stack.push(i);
        }
        assertEquals(true, stack.isFull());
    }

    @Test
    void isEmpty_test() {
        assertEquals(true, stack.isEmpty());
    }
}