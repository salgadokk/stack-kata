package tdd;

public class Stack {
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(final int value) {
        size++;
    }

    public void pop() {
        size--;
    }

    public int size() {
        return size;
    }
}
