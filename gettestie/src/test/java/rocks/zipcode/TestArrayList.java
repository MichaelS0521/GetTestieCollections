package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    @Test
    public void testArrayContains() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        boolean actualArrayList = arrayList.contains(1);

        Assert.assertTrue(actualArrayList);
    }

    @Test
    public void testArraySize() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        Integer expectedArraySize = 2;
        Integer actualArraySize = arrayList.size();

        Assert.assertEquals(expectedArraySize, actualArraySize);
    }

    @Test
    public void testEmptyArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        arrayList.clear();
        boolean actualArrayEmpty = arrayList.isEmpty();

        Assert.assertTrue(actualArrayEmpty);
    }

    @Test
    public void testRemoveArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.remove(3);

        boolean actualInArrayList = (!arrayList.contains(4));

        Assert.assertTrue(actualInArrayList);
    }
}
