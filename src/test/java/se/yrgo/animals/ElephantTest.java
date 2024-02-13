package se.yrgo.animals;

import org.junit.jupiter.api.Test;
import se.yrgo.utils.Gender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ElephantTest {


    @Test
    void testGetMemoryCapacity() {
        Elephant e1 = new Elephant("Adam", 5, Gender.MALE, 3032);
        Elephant e2 = new Elephant("Badam", 10, Gender.MALE, 3430);
        Elephant e3 = new Elephant("Cadam", 15, Gender.MALE, 3342);
        Elephant e4 = new Elephant("Fadam", 44, Gender.MALE, 3132);
        Elephant e5 = new Elephant("Kadam", -5, Gender.MALE, 3132);

        assertEquals(80, e1.getMemoryCapacity(), "return 80");
        assertEquals(80, e2.getMemoryCapacity(), "return 80");
        assertEquals(100, e3.getMemoryCapacity(), "return 100");
        assertEquals(100, e4.getMemoryCapacity(), "return 145");

        try {
            e5.getMemoryCapacity();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            System.out.println("Successfully caught exception!");
        }
    }

}
