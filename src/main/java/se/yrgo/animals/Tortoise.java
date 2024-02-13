package se.yrgo.animals;

import se.yrgo.utils.Gender;

/***
 * @author Älva
 */
public class Tortoise extends Animal {

    public Tortoise(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    @Override
    public String makeSound() {
        return "grunt grunt squeeeak" + "\n";
    }

    public void eat(double foodWeight){
        double newWeight = getWeight() + foodWeight;
        setWeight(newWeight);
    }

    public void checkWeight(){
        double weight = getWeight();
        if(weight > 150){
            System.out.println("Time for a diet!");
            setWeight(weight - 5);
        } else {
            System.out.println("Weight is normal. Keep on munching!");
        }
    }

    public boolean hibernate(boolean isWinter){
        if(isWinter){
            System.out.println("Going into hibernation...");
            return true;
        } else {
            System.out.println("Not hibernating! Let's enjoy the warmth");
            return false;
        }
    }


}
