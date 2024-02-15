package se.yrgo.animals;

import se.yrgo.utils.Gender;

/***
 * @author Älva
 */
public class Tortoise extends Animal {

    public Tortoise(String name, int age, Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    /**
     * generate unique sound for animal
     * @return sound as string
     */
    @Override
    public String makeSound() {
        return "grunt grunt squeeeak" + "\n";
    }

    /**
     * This method adds weight when animal eats
     * @param foodWeight is how much food the animal eats as well as how much weight should be added
     */
    public void eat(double foodWeight){
        double newWeight = getWeight() + foodWeight;
        setWeight(newWeight);
    }

    /**
     * This method checks weight to check it's its heathy, unhealthy or... dead
     * @return string specifying if it's healthy or fat
     */
    public String checkWeight(){
        if(this.getWeight() <= 0.7){
            throw new IllegalArgumentException("I think it might be dead....");
        }
        if(this.getWeight() > 150){
            System.out.println(getName() + " needs to go on a diet!");
            return "fat";
        } else {
            System.out.println(getName() + "'s weight is normal. Keep on munching!");
            return "healthy";
        }
    }

    /**
     * This method checks if animal should/will hibernate
     * @param isWinter insert true or false if it is winter
     * @return boolean that specifies if animal went into hibernation(true) or not(false)
     */
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
