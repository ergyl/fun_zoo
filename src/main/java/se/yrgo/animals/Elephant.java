package se.yrgo.animals;

import se.yrgo.utils.Gender;

/***
 * @author Erik
 */
public class Elephant extends Animal {

    public Elephant(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    /**
     * The unique sound of the elephant
     * @return sound
     */
    @Override
    public String makeSound() {
        return "tooot toooooot!";
    }

    /**
     * Method used to determine the elephant's memory capacity
     * which is determined by its age. Older elephants have better memory.
     * @return memory capacity of the elephant
     * @throws IllegalArgumentException if its age is less than 0.
     */
    public int getMemoryCapacity() {
        if (this.getAge() < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
        if (this.getAge() > 10) {
            return 100;
        } else if (this.getAge() > 40) {
            return 145;
        } else return 80;
    }

}
