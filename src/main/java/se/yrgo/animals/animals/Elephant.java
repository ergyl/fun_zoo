package se.yrgo.animals.animals;

import se.yrgo.animals.utils.Gender;

/***
 * @author Erik
 */
public class Elephant extends Animal {

    public Elephant(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    @Override
    public String makeSound() {
        return "tooot toooooot!";
    }
}
