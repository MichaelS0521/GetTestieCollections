package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Test
    public void testComparable() {
        int a = 21;
        int b = 21;

        int expectedComparison = compareTo(a);
        int actualComparison = compareTo(b);

        Assert.assertEquals(expectedComparison, actualComparison);
    }
}
