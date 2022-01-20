package adt.queue;

/**
 * Simplest implementation of a Queue can be achieved as follows,
 * using two ends of a LinkedList. What's in the middle don't
 * matter because of the nature of Queues only being concerned
 * with the front and the end.
 * <p>
 * All Operations are O(1) Constant time.
 *
 * @param <T>
 */
public class LinkedQueue<T> implements Queue<T> {

    Node<T> head, tail;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(T item) throws Exception {
        Node toInsert = new Node(item);

        // add to an empty queue
        if (tail == null) {
            this.head = this.tail = toInsert;
            return;
        }

        this.tail.next = toInsert;

    }

    @Override
    public T dequeue() throws Exception {
        if (head == null) throw new Exception("Queue is empty");

        T item = head.data;
        head = head.next;

        // if after dequeueing, head becomes null, that means queue is empty, so set tail to null
        if (head == null)
            tail = null;
        return item;
    }

    @Override
    public T head() {
        return this.head.data;
    }

    @Override
    public T tail() {
        return this.tail.data;
    }
}

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
    }
}
