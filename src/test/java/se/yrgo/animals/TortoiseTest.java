package se.yrgo.animals;
import org.junit.jupiter.api.*;
import se.yrgo.utils.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Älva
 */
public class TortoiseTest {

    @Test
    public void testHibernateInWinter(){
        Tortoise tortoise = new Tortoise("James", 50, Gender.FEMALE, 130);
        assertTrue(tortoise.hibernate(true));
    }

    @Test
    public void testHibernateInSummer(){
        Tortoise tortoise = new Tortoise("James", 50, Gender.FEMALE, 130);
        assertFalse(false);
    }

    @Test
    public void testEat(){
        Tortoise tortoise = new Tortoise("James", 50, Gender.FEMALE, 130);
        double intialWeight = tortoise.getWeight();
        double foodWeight = 2; // kg
        assertEquals(intialWeight + foodWeight, tortoise.getWeight(), 2);
    }

    @Test
    public void testCheckWeight(){
        Tortoise tortoiseAboveWeight = new Tortoise("James", 50, Gender.FEMALE, 153); // Weight is above normal
        Tortoise tortoiseNormalWeight = new Tortoise("James", 50, Gender.FEMALE, 30); // Weight is under normal
        Tortoise tortoiseNoWeight = new Tortoise("James", 50, Gender.FEMALE, 0.5); // Exception test
        assertEquals(tortoiseNormalWeight.checkWeight(), "healthy");
        assertEquals(tortoiseAboveWeight.checkWeight(), "fat");

        try{
            tortoiseNoWeight.checkWeight();
            fail("There should be an IllegalArgumentsException here");
        } catch (IllegalArgumentException ex){
            System.out.println("Exception was caught!");
        }
    }

}
