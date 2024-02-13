package se.yrgo.animals.animals;

import se.yrgo.animals.utils.Gender;

/***
 * @author Älva
 */
public class Tortoise extends Animal {

    public Tortoise(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    @Override
    public String makeSound() {
        return "grunt grunt squeeeak" + "\n";
    }
}
