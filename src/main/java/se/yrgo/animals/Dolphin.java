package se.yrgo.animals;

import se.yrgo.utils.Gender;

/***
 * @author Ludwig
 */
public class Dolphin extends Animal {

    public Dolphin(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    public String dolphinEats() {
        if (getAge() > 1 || getAge() <= 10) {
            return "squid";
        }
        if (getAge() > 10 || getAge() <= 30) {
            return "shrimps";
        }
        if (getAge() > 30 || getAge() <= 50) {
            return "jellyfish";
        }
        if (getAge() > 50 || getAge() <= 70) {
            return "octopuses";
        }
        if (getAge() > 1 || getAge() <= 100) {
            return "crab";
        }
        return "fish";
    }

    @Override
    public String makeSound() {
        return "Clicks whistles";
    }
}
