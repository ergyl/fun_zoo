package se.yrgo.animals;

import se.yrgo.utils.Gender;

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
