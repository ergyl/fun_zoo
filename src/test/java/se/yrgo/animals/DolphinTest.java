package se.yrgo.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import se.yrgo.animals.Dolphin;
import se.yrgo.utils.Gender;

public class DolphinTest {

    public void testdolphinEats () {
        Dolphin age9 = new Dolphin("philips", 9, Gender.MALE, 200);
        assertEquals(age9, age9.dolphinEats());

        Dolphin age20 = new Dolphin("mia", 20, Gender.FEMALE, 459);
        assertEquals(age20, age20.dolphinEats());

        Dolphin age41 = new Dolphin("stones", 41, Gender.MALE, 459);
        assertEquals(age41, age41.dolphinEats());

        Dolphin age62 = new Dolphin("zidane", 62, Gender.MALE, 459);
        assertEquals(age62, age62.dolphinEats());

        Dolphin age99 = new Dolphin("rashford", 99, Gender.MALE, 459);
        assertEquals(age99, age99.dolphinEats());

        Dolphin age329 = new Dolphin("carola", 329, Gender.FEMALE, 459);
        assertEquals(age329, age329.dolphinEats());

    }
}
