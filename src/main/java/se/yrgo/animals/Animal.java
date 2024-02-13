package se.yrgo.animals;

import se.yrgo.utils.Gender;

import java.util.Comparator;

/***
 * The abstract base class for all animal types.
 * All new Animal types extend this class.
 * The abstract methods in this class need to be implemented by new Animal types.
 */
public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private final Gender gender;
    private double weight;

    /***
     * Constructor
     * @param name of the animal
     * @param age of the animal
     * @param weight of the animal in kilograms (kg)
     */
    public Animal(String name, int age, Gender gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    /***
     * Compare animals
     * First compare if they are the same animal type in asc order.
     * If they are not the same animal type, compare age in desc order.
     * Else, compare the names in asc order.
     * Lastly, compare the weight in desc order.
     * We don't override the equals() method because every animal is unique.
     * @param other the animal to be compared.
     * @return result of comparison
     */
    @Override
    public int compareTo(Animal other) {
        Comparator<Animal> comp = Comparator.comparing((Animal a) -> a.getClass().getSimpleName())
                .thenComparing((Animal a) -> -a.getAge()) // Compare age in descending order
                .thenComparing(Animal::getName)
                .thenComparing((Animal a) -> -a.getWeight()); // Compare weight in descending order
        return comp.compare(this, other);
    }

    @Override
    public String toString() {
        var animalType = this.getClass().getSimpleName();

        return "Animal type: " + animalType + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Weight: " + weight + " kg" + "\n";
    }

}
