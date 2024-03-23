package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    @Test
    public void testIterator() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello World");
        Iterator<String> iterator = arrayList.iterator();

        String expectedString = "Hello World";
        String actualString = iterator.next();

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testRemoveIterator() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Welcome ");
        arrayList.add("to ");
        arrayList.add("Hello World");
        Iterator<String> iterator = arrayList.iterator();
        iterator.next();
        iterator.remove();

        String expectedStringToRemove = "to ";
        String actualStringToRemove = iterator.next();

        Assert.assertEquals(expectedStringToRemove, actualStringToRemove);

    }
}
