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

    public String checkWeight(){
        double weight = getWeight();
        if(weight > 150){
            System.out.println(getName() + " needs to go on a diet!");
            return "fat";
        } else {
            System.out.println(getName() + "'s weight is normal. Keep on munching!");
            return "healthy";
        }
    }

    public boolean hibernate(boolean isWinter){
        if(isWinter){
            System.out.println(getName() + " is going into hibernation...");
            return true;
        } else {
            System.out.println(getName() + " is not hibernating! Let's enjoy the warmth");
            return false;
        }
    }


}
