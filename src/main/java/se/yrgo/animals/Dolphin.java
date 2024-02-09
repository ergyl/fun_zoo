package se.yrgo.animals;

/***
 * @author Ludwig
 */
public class Dolphin extends Animal {

    public Dolphin(String name, int age, double weight) {
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
