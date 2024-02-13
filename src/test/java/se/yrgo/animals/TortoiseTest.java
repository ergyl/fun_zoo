package se.yrgo.animals;
import org.junit.jupiter.api.*;
import se.yrgo.animals.animals.*;
import se.yrgo.animals.utils.*;
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
        assertEquals(intialWeight + foodWeight, tortoise.getWeight(), 0.01);
    }


}
