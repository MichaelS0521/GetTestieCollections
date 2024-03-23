package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {
    ArrayDeque<String> deque = new ArrayDeque<>();

    @Test
    public void testAddFirstInArray() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("numOne");
        deque.add("numTwo");
        deque.addFirst("numThree");

        String expectedFirstString = "numThree";
        String actualFirstString = deque.getFirst();

        Assert.assertEquals(expectedFirstString, actualFirstString);
    }

    @Test
    public void testGetFirstInArray() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("numOne");
        deque.add("numTwo");

        String expectFirstString = "numOne";
        String actualFirstString = deque.getFirst();

        Assert.assertEquals(expectFirstString, actualFirstString);
    }

    @Test
    public void testAddLastInArray() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("numOne");
        deque.add("numTwo");
        deque.add("numThree");
        deque.addLast("numFour");

        String expectLastString = "numFour";
        String actualLastString = deque.getLast();

        Assert.assertEquals(expectLastString, actualLastString);
    }

    @Test
    public void testGetLastInArray() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("numOne");
        deque.add("numTwo");
        deque.add("numThree");

        String expectedLastInArray = "numThree";
        String actualLastInArray = deque.getLast();

        Assert.assertEquals(expectedLastInArray, actualLastInArray);
    }
}
