package se.yrgo.animals;

/***
 * The abstract base class for all animal types.
 * All new Animal types extend this class.
 * The abstract methods in this class need to be implemented by new Animal types.
 */
public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    /***
     * Constructor
     * @param name of the animal
     * @param age of the anmial
     * @param weight of the animal in kilograms (kg)
     */
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        var animalType = this.getClass().getSimpleName();
        var newLine = System.lineSeparator();

        return "Animal type: " + animalType + newLine +
                "Name: " + name + newLine +
                "Age: " + age + newLine +
                "Weight: " + weight + " kg" + newLine;
    }

}
