package tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StackTest {

    @Test
    void isEmpty() {
        Stack stack = new Stack();
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    void notEmptyAfterPush() {
        //arrange
        Stack stack = new Stack();
        //act
        stack.push(1);
        //assert
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    void emptyAfterPushPop() {
        //arrange
        Stack stack = new Stack();
        //act
        stack.push(1);
        stack.pop();
        //assert
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    void initialSizeZero() {
        //arrange
        Stack stack = new Stack();
        //act assert
        assertThat(stack.size(), is(0));
    }

    @Test
    void sizeOneAfterPush() {
        //arrange
        Stack stack = new Stack();
        //act
        stack.push(1);
        //assert
        assertThat(stack.size(), is(1));
    }
}