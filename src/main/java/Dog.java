/**
 * The Dog class represents a dog's name, breed and weight
 * @author Hailey Tam
 */

class Dog{

//instance variables
private String name;
private String breed;
private int weight;

/**
 * Constructs a dog object with a specific name, breed, and weight
 * @param name a string that stores the dog's name
 * @param breed a string that stores the dog's breed
 * @param weight a integer that stores the dog's weight
 */

 //constructor 
public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

/**
 * @return returns the value of name, which tells you the dog's name
 * 
 */

public String getName(){
    return this.name;
}

/**
 * @return returns the value of breed, which tells you the dog's breed
 * 
 */

public String getBreed(){
    return this.breed;
}

/**
 * @return returns the value of weight, which tell you the dog's weight
 * 
 */

public int getWeight(){
    return this.weight;
}

/**
 * sets the value of the instance variable, name
 * @param newName a String that will replace the value of name
 */

public void setName(String newName){
    this.name = newName;
}

/**
 * sets the value of the instance variable, breed
 * @param newBreed a String that will replace the value of breed
 */

public void setBreed(String newBreed){
    this.breed = newBreed;
}

/**
 * sets the value of the instance variable, weight
 * @param newWeight a integer that will replace the value of weight
 */

public void setWeight(int newWeight){
    if (newWeight > 0){
        this.weight = newWeight;
        }
    }
}