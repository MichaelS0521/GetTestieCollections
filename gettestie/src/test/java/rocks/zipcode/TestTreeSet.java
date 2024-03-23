package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testFirstString() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C++");
        treeSet.add("Java");
        treeSet.add("HTML");
        treeSet.add("Python");

        String expectedString = "C++";
        String actualString = treeSet.first();

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testLastString() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C++");
        treeSet.add("Java");
        treeSet.add("HTML");
        treeSet.add("Python");

        String expectedString = "Python";
        String actualString = treeSet.last();

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testLowerValue() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);

        Integer expectedValue = 3;
        Integer actualValue = treeSet.lower(4);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testHigherValue() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);

        Integer expectedValue = 4;
        Integer actualValue = treeSet.higher(3);

        Assert.assertEquals(expectedValue, actualValue);
    }
}
