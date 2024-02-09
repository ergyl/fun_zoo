package se.yrgo.animals;

/***
 * @author Älva
 */
public class Tortoise extends Animal {

    public Tortoise(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String doATrick() {
        return null;
    }
}
