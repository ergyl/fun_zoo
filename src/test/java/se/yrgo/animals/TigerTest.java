package se.yrgo.animals;

import org.junit.jupiter.api.Test;
import se.yrgo.animals.Tiger;
import se.yrgo.utils.Gender;

import static org.junit.jupiter.api.Assertions.*;
public class TigerTest {

    /**
     * Tests if the getLifeStage method returns the correct life stage in correlation with the tigers age in years
     */
    @Test
    public void testLifeStage() {
        Tiger newborn = new Tiger("baby", 1, Gender.MALE, 1);
        assertEquals("Newborn", newborn.getLifeStage());

        Tiger cub = new Tiger("kid", 2, Gender.FEMALE, 5);
        assertEquals("Cub", cub.getLifeStage());

        Tiger adolescent = new Tiger("young", 4, Gender.MALE, 20);
        assertEquals("Adolescent", adolescent.getLifeStage());

        Tiger adult = new Tiger("old", 15, Gender.FEMALE, 35);
        assertEquals("Adult", adult.getLifeStage());
    }
}
