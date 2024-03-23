package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test
    public void testRemoveString() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("coding ");
        priorityQueue.add("is ");
        priorityQueue.add("the ");
        priorityQueue.add("fun.");
        priorityQueue.remove("the ");

        int expectedSize = 3;
        int actualSize = priorityQueue.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
