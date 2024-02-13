package se.yrgo.utils;

import se.yrgo.animals.Animal;
import se.yrgo.zoo.Zoo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class ZooAction {

    public static String getAnimalsToPrint(Zoo zoo) {
        StringBuilder builder = new StringBuilder();
        builder.append("Animals currently in ").append(zoo.getName()).append("\n")
                .append("------------------------" + "\n");
        for (Animal animal : zoo.getAnimals()) {
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }

    /**
     * Method used to add an animal to the zoo.
     *
     * @param animal to be added
     */
    public static void addAnimal(Zoo zoo, Animal animal) {
        zoo.getAnimals().add(animal);
    }

    /**
     * Method used to remove an animal from the zoo.
     *
     * @param animal to be removed
     */
    public static void removeAnimal(Zoo zoo, Animal animal) {
        zoo.getAnimals().remove(animal);
    }

    /***
     * Method used to retrieve the number of animals are held in the zoo.
     * @return the number of animals in the list
     */
    public static int countAnimals(Zoo zoo) {
        return zoo.getAnimals().size();
    }

    /**
     * Helper method to getZooAnimalCount
     * @return map of all animals in the zoo by type and their count
     */
    private static Map<Class<? extends Animal>, Integer> countAnimalsByType(Zoo zoo) {
        Map<Class<? extends Animal>, Integer> countMap = new HashMap<>();

        for (Animal animal : zoo.getAnimals()) {
            Class<? extends Animal> animalType = animal.getClass();
            countMap.put(animalType, countMap.getOrDefault(animalType, 0) + 1);
        }
        return countMap;
    }

    /***
     * Method to get info on how many animals are currently in the zoo,
     * and a count of their type.
     * @return String to print in Main
     */
    public static String getZooAnimalCount(Zoo zoo) {
        StringBuilder builder = new StringBuilder();
        Collections.sort(zoo.getAnimals());

        var countAnimalTypes = countAnimalsByType(zoo);

        builder.append("Total number of animals: ").append(countAnimals(zoo)).append(System.lineSeparator());

        for (Map.Entry<Class<? extends Animal>, Integer> entry : countAnimalTypes.entrySet()) {
            Class<? extends Animal> animalType = entry.getKey();
            int count = entry.getValue();
            builder.append("Number of ").append(animalType.getSimpleName()).append("s : ").append(count).append("\n");
        }

        return builder.toString();
    }
}
