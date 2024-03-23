package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;


import java.util.HashSet;

public class TestHashSet {

    @Test
    public void testAdd() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);

        boolean actualHashSet = hashSet.contains(2);

        Assert.assertTrue(actualHashSet);
    }

    @Test
    public void testRemoveFromHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        hashSet.remove(3);

        boolean actualHashSet = (!hashSet.contains(3));

        Assert.assertTrue(actualHashSet);
    }

    @Test
    public void testEmptyHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);

        hashSet.clear();
        boolean actualHashSet = hashSet.isEmpty();  // looks to see if the hashSet is empty

        Assert.assertTrue(actualHashSet);
    }

    @Test
    public void testSizeOfHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        Integer expectedHashSetSize = 4;
        Integer actualHashSetSize = hashSet.size();

        Assert.assertEquals(expectedHashSetSize, actualHashSetSize);
    }

    @Test
    public void testHashSetContains() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        boolean actualHashSetValue = hashSet.contains(4);

        Assert.assertTrue(actualHashSetValue);
    }
}
