package se.yrgo.zoo;

import se.yrgo.animals.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zoo {
    private String name;
    private String streetAddress;
    private String zipCode;
    private String country;
    private List<Animal> animals;

    public Zoo(String name, String streetAddress, String zipCode, String country) {
        Objects.requireNonNull(name, "Zoo needs a name");
        Objects.requireNonNull(streetAddress, "Zoo needs a street address");
        Objects.requireNonNull(country, "Zoo needs to be in a country");

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }

        if (streetAddress.isEmpty()) {
            throw new IllegalArgumentException("Zoo street address cannot be empty");
        }

        if (zipCode.isEmpty()) {
            throw new IllegalArgumentException("Zip code cannot be empty");
        }

        if (country.isEmpty()) {
            throw new IllegalArgumentException("Zoo country cannot be empty");
        }

        this.name = name;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.country = country;
        animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    /***
     * Method used to retrieve the number of animals are held in the zoo.
     * @return the number of animals in the list
     */
    public int countAnimals() {
        return animals.size();
    }
}
