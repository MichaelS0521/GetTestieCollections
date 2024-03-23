package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestVector {

    @Test
    public void testAddVector() {
        Vector<String> vector = new Vector<>();
        vector.add("Coding");
        vector.add("the");
        vector.add("best");
        vector.add(1, "is");

        String expectedString = "is";
        String actualString = vector.get(1);

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testIteratorVector() {
        Vector<String> vector = new Vector<>();
        vector.add("coding");
        vector.add("takes");
        vector.add("problem");
        vector.add("solving");
        Iterator<String> iterator = vector.iterator();

        String expectedString = "coding";
        String actualString = iterator.next();

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testEqualsVector() {
        Vector<String> vector = new Vector<>();
        Vector<String> vectorTwo = new Vector<>();

        vector.add("zipcode");
        vectorTwo.add("zipcode");

        boolean actualString = vector.equals(vectorTwo);

        Assert.assertTrue(actualString);
    }
}
