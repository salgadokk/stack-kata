package tdd;

public class Stack {
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(final int value) {
        isEmpty = false;
    }
}
