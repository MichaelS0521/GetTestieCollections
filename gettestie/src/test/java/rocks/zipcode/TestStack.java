package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testPopStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.pop();

        String expectedStringInStack = "Hello";
        String actualStringInStack = stack.peek();

        Assert.assertEquals(expectedStringInStack, actualStringInStack);
    }

    @Test
    public void testEmptyStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.pop();
        stack.pop();

        boolean actualStackStatus = stack.isEmpty();

        Assert.assertTrue(actualStackStatus);
    }


}
