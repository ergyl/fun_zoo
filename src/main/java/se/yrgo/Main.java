package se.yrgo;

import se.yrgo.animals.*;
import se.yrgo.utils.Gender;
import se.yrgo.utils.ZooAction;
import se.yrgo.zoo.Zoo;

/**
 * The entry point for the application.
 */
public class Main {

    public static void main(String[] args) {

        Tortoise galapagosTortoise = new Tortoise("James", 68, Gender.FEMALE, 123.24);
        Tortoise rebecca = new Tortoise("Rebecca", 40, Gender.FEMALE, 104.4);
        Tortoise jim = new Tortoise("Jim", 34, Gender.MALE, 109.5);

        Elephant ben = new Elephant("Ben", 25, Gender.MALE, 6191.5);
        Elephant bob = new Elephant("Bob", 10, Gender.MALE, 5999.9);
        Elephant rico = new Elephant("Rico", 19, Gender.MALE, 5895.1);
        Elephant sheila = new Elephant("Sheila", 11, Gender.FEMALE, 5559.9);
        Elephant pedro = new Elephant("Stefan", 40, Gender.MALE, 6019.6);
        Elephant maude = new Elephant("Maude", 55, Gender.FEMALE, 6193.4);

        Dolphin dolphin = new Dolphin("hera", 12, Gender.MALE, 1404);

        Tiger scar = new Tiger("Scar", 40, Gender.MALE, 50);
        Tiger simba = new Tiger("Simba", 5, Gender.MALE, 10);

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
        ZooAction.addAnimal(theZoo, dolphin);
        ZooAction.addAnimal(theZoo, scar);
        ZooAction.addAnimal(theZoo, simba);
        
        System.out.println(theZoo);
        System.out.println(ZooAction.getZooAnimalCount(theZoo));

        System.out.println(ZooAction.getAnimalsToPrint(theZoo));
    }
}
