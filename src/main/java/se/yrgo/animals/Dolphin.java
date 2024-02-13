package se.yrgo.animals;

import se.yrgo.utils.Gender;

/***
 * @author Ludwig
 */
public class Dolphin extends Animal {

    public Dolphin(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    @Override
    public String makeSound() {
        return null;
    }
}
