package tdd;

public class Stack {
    private int size = 0;
    private StackObject current;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(final int value) {
        this.current = new StackObject(value, this.current);
        size++;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();
        size--;
        int tmpVal = current.value;
        this.current = this.current.next;
        return tmpVal;
    }

    public int size() {
        return size;
    }

    private class StackObject {
        private int value;
        private StackObject next;

        public StackObject(final int value, final StackObject next) {
            this.value = value;
            this.next = next;
        }
    }
}
