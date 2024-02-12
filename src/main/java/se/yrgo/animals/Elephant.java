package se.yrgo.animals;

/***
 * @author Erik
 */
public class Elephant extends Animal {

    public Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String makeSound() {
        return "tooot toooooot!";
    }
}
