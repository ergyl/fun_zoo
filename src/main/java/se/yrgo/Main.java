package se.yrgo;

import se.yrgo.animals.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Insert created animal instances here
        List<Animal> animals = new ArrayList<>();

        // TODO create instances of animals
        Tortoise galapagosTortoise = new Tortoise(
                "Galapagos tortoise James", 68, 112.65);
        galapagosTortoise.makeSound();
        animals.add(galapagosTortoise);

        // TODO print information about all our animals
        for (Animal animal : animals){
            System.out.println(animal);
            animal.makeSound();
        }
    }
}
