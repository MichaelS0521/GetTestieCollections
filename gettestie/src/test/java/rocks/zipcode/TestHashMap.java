package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;


import java.util.HashMap;

public class TestHashMap {
    HashMap<Person, Address> hashMap = new HashMap<>();
    Person person = new Person("Bob", 2000);
    Address address = new Address("29 Pepper Dr", "Delaware", "19721");


    @Test
    public void testGetInformation() {
        hashMap.put(person, address);

        Address expectedInformation = address;
        Address actualInformation = hashMap.get(person);

        Assert.assertEquals(expectedInformation, actualInformation);
    }

    @Test
    public void testRemoveInformation() {
        hashMap.put(person, address);
        hashMap.remove(person);

        boolean actualInformation = hashMap.isEmpty();

        Assert.assertTrue(actualInformation);
    }
}
