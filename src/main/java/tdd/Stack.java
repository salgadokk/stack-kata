package tdd;

public class Stack {
    private int size = 0;
    private int[] values = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(final int value) {
        this.values[size] = value;
        size++;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();
        size--;
        return values[size];
    }

    public int size() {
        return size;
    }
}
