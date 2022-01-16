package adt.list;

public class LinkedList<T> implements IList<T> {

    private Node<T> head;

    /**
     * Add to the end (append).
     * <p>
     * BigO: O(n) - Linear time.
     * Appending to the list requires traversal to the last element of the list of N elements.
     * At the end of the traversal, reference to next on the last node points to the newly inserted node.
     *
     * @param item
     */
    @Override
    public void add(T item) {
        if (head == null) {
            this.head = new Node<>(item);
            return;
        }

        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(item);
    }

    /**
     * Prepend to linked list.
     * <p>
     * BigO: O(1) - Constant time.
     * As a reference to the head node is always tracked, it's easy to change the next reference without any traversal.
     *
     * @param item
     */
    public void addToFront(T item) {
        Node toAdd = new Node<>(item);
        toAdd.next = this.head;
        this.head = toAdd;
    }

    /**
     * Insert a new item to the list at the specified index.
     * <p>
     * BigO: O(n) - Linear time.
     * In order to insert at a specified index, it requires a traversal from the head node to the n-th node specified
     * by index. (e.g. there are 10 elements
     *
     * @param item
     * @param index
     */
    @Override
    public void add(T item, int index) {
        if (index < 0) throw new IndexOutOfBoundsException();

        Node current = head;
        int idx = 0;
        while (idx < index) {
            current = current.next;
            idx++;
        }

        current.next = new Node<>(item);
    }

    @Override
    public boolean contains(T item) {
        Node current = head;
        while (current.data != item) {
            if (current.data == item)
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        int count = head != null ? 1 : 0;
        Node current = head;

        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public T get(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();

        int idx = 0;
        Node toReturn = head;
        while (toReturn.next != null && idx++ <= index) {
            toReturn = toReturn.next;
            if (idx == index) return (T) toReturn.data;
        }
        return null;
    }

    @Override
    public T remove(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();

        Node toRemove = head;
        int idx = 0;
        if (index == 0) {
            head = head.next;
        } else {
            while (toRemove.next != null && idx++ <= index) {
                toRemove = toRemove.next;
                if (idx == index) break;
            }
        }
        return (T) toRemove.data;
    }
}

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
    }
}
