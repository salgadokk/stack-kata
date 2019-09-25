package tdd;

public class Stack {
    private int size = 0;
    private int value;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(final int value) {
        size++;
        this.value = value;
    }

    public int pop() {
        size--;
        return value;
    }

    public int size() {
        return size;
    }
}
