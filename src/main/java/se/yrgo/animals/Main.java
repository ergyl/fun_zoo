package se.yrgo.animals;

import se.yrgo.animals.animals.Animal;
import se.yrgo.animals.animals.Elephant;
import se.yrgo.animals.animals.Tortoise;
import se.yrgo.animals.utils.Gender;
import se.yrgo.animals.utils.ZooAction;
import se.yrgo.animals.zoo.Zoo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Insert created animal instances here
        List<Animal> animals = new ArrayList<>();

        // TODO create instances of animals
        Tortoise galapagosTortoise = new Tortoise("James", 68, Gender.FEMALE, 123.24);
        galapagosTortoise.makeSound();
        animals.add(galapagosTortoise);


        Elephant ben = new Elephant("Ben", 25, Gender.MALE, 6191.5);
        Tortoise rebecca = new Tortoise("Rebecca", 40, Gender.FEMALE, 104.4);
        Tortoise jim = new Tortoise("Jim", 34, Gender.MALE, 109.5);
        Elephant bob = new Elephant("Bob", 10, Gender.MALE, 5999.9);
        Elephant rico = new Elephant("Rico", 19, Gender.MALE, 5895.1);
        Elephant sheila = new Elephant("Sheila", 11, Gender.FEMALE, 5559.9);
        Elephant pedro = new Elephant("Stefan", 40, Gender.MALE, 6019.6);
        Elephant maude = new Elephant("Maude", 55, Gender.FEMALE, 6193.4);

        //Create the zoo
        Zoo theZoo = new Zoo("Paradise Zoo", "Lincoln Avenue 199", "1920 KO", "USA");

        ZooAction.addAnimal(theZoo, galapagosTortoise);
        ZooAction.addAnimal(theZoo, ben);
        ZooAction.addAnimal(theZoo, rebecca);
        ZooAction.addAnimal(theZoo, jim);
        ZooAction.addAnimal(theZoo, bob);
        ZooAction.addAnimal(theZoo, rico);
        ZooAction.addAnimal(theZoo, rico);
        ZooAction.addAnimal(theZoo, sheila);
        ZooAction.addAnimal(theZoo, pedro);
        ZooAction.addAnimal(theZoo, maude);

        System.out.println(theZoo);
        System.out.println(ZooAction.getZooAnimalCount(theZoo));

        System.out.println(ZooAction.getAnimalsToPrint(theZoo));
    }
}
