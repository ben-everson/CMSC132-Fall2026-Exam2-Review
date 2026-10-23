package Tests;

import org.junit.*;

import polymorphicList.Stack;

import static org.junit.Assert.*;

public class StackTests {

    @Test
    public void testPushPeek() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        assertEquals(Integer.valueOf(10), stack.peek());

        stack.push(20);
        assertEquals(Integer.valueOf(20), stack.peek());
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(Integer.valueOf(30), stack.pop());
        assertEquals(Integer.valueOf(20), stack.pop());
        assertEquals(Integer.valueOf(10), stack.pop());
    }

    @Test
    public void testIsEmpty() {
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeekDoesNotRemoveElement() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);

        assertEquals(Integer.valueOf(10), stack.peek());
        assertEquals(Integer.valueOf(10), stack.peek());
        assertEquals(Integer.valueOf(10), stack.pop());
    }
}