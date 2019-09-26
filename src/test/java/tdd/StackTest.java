package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackTest {

    Stack stack;

    @BeforeEach
    void setup() {
        stack = new Stack();
    }

    @Test
    void isEmpty() {
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    void notEmptyAfterPush() {
        //act
        stack.push(1);
        //assert
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    void emptyAfterPushPop() {
        //act
        stack.push(1);
        stack.pop();
        //assert
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    void initialSizeZero() {
        //act assert
        assertThat(stack.size(), is(0));
    }

    @Test
    void sizeOneAfterPush() {
        //act
        stack.push(1);
        //assert
        assertThat(stack.size(), is(1));
    }

    @Test
    void sizeZeroAfterPushPop() {
        //act
        stack.push(1);
        stack.pop();
        //assert
        assertThat(stack.size(), is(0));
    }

    @Test
    void sizeTwoAfterPushPush() {
        //act
        stack.push(1);
        stack.push(1);
        //assert
        assertThat(stack.size(), is(2));
    }

    @Test
    void popReturnsPushedValue() {
        //act
        stack.push(1);
        //assert
        assertThat(stack.pop(), is(1));
    }

    @Test
    void popReturnsPushedValue_2() {
        //act
        stack.push(2);
        //assert
        assertThat(stack.pop(), is(2));
    }

    @Test
    void popReturnsExpectedValues() {
        //act
        stack.push(1);
        stack.push(2);
        //assert
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
    }

    @Test
    void popOnEmptyStackThrows() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

}