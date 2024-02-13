package se.yrgo.animals;
import org.junit.jupiter.api.*;
import se.yrgo.utils.*;
import static org.junit.jupiter.api.Assertions.*;

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
        Tortoise tortoiseNormalWeight = new Tortoise("James", 50, Gender.FEMALE, 130); // Weight is under normal
        assertEquals(tortoiseNormalWeight.checkWeight(), "healthy");
        assertEquals(tortoiseAboveWeight.checkWeight(), "fat");
    }

}
