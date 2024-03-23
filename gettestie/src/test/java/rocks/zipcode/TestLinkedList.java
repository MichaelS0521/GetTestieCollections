package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void testLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        linkedList.set(0,4);

        Integer expectedInteger = 4;
        Integer actualInteger = linkedList.get(0);

        Assert.assertEquals(expectedInteger, actualInteger);
    }

    @Test
    public void testLinkedListRemove() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        linkedList.remove(1);

        Integer expectedInteger = 1;
        Integer actualInteger = linkedList.get(0);

        Assert.assertEquals(expectedInteger, actualInteger);
    }

    @Test
    public void testLinkedListGetIndex() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);

        Integer expectedIndex = 2;
        Integer actualIndex = linkedList.indexOf(3);

        Assert.assertEquals(expectedIndex, actualIndex);
    }
}
