package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testTreeMapContainsKey() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Hello World");

        boolean actualTreeMapKey = treeMap.containsKey(1);

        Assert.assertTrue(actualTreeMapKey);
    }

    @Test
    public void testTreeMapContainsValue() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Hello World");

        boolean actualTreeMapValue = treeMap.containsValue("Hello World");

        Assert.assertTrue(actualTreeMapValue);
    }

    @Test
    public void testTreeMapEntrySet() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Baseball");
        treeMap.put(2, "Football");
        treeMap.put(3, "BasketBall");
        treeMap.put(4, "Soccer");

        int expectedEntrySet = 4;
        int actualEntrySet = treeMap.entrySet().size();

        Assert.assertEquals(expectedEntrySet, actualEntrySet);
    }
}
