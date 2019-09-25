package tdd;

public class Stack {
    private boolean isEmpty = true;
    private int size = 0;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(final int value) {
        isEmpty = false;
        size++;
    }

    public void pop() {
        isEmpty = true;
    }

    public int size() {
        return size;
    }
}
