package tdd;

public class Stack {
    private int size = 0;
    private int[] values = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(final int value) {
        if (size == values.length)
            this.values = copyArray(this.values);
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

    private int[] copyArray(int[] oldArray) {
        int[] newValues = new int[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++)
            newValues[i] = oldArray[i];
        return newValues;
    }
}
