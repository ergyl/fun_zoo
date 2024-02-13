package se.yrgo.animals;

import se.yrgo.utils.Gender;

public class Tiger extends Animal {

    public Tiger(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    public String getLifeStage() {
        if (getAge() <= 1) {
            return "Newborn";
        }
        if (getAge() < 3) {
            return "Cub";
        }
        if (getAge() < 5) {
            return "Adolescent";
        }
        return "Adult";
    }
}
