/**
 * The Dog class represents a dog's name, breed and weight
 * @author Hailey Tam
 */

class Dog{

private String name;
private String breed;
private int weight;

/**
 * Constructs a dog with a specific name, breed, and weight
 * @param name a string that represents the dog's name
 * @param breed a string that represents the dog's breed
 * @param weight a integer that represents the dog's weight in pounds
 */

public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

/**
 * Gets the dog's name
 * @return returns the value of name as a String, which represents the dog's name
 */

public String getName(){
    return this.name;
}

/**
 * Gets the dog's breed
 * @return returns the value of breed as a String, which represents the dog's breed
 */

public String getBreed(){
    return this.breed;
}

/**
 * Gets the dog's weight in pounds
 * @return returns the value of weight as a integer, which represents the dog's weight in pounds
 */

public int getWeight(){
    return this.weight;
}

/**
 * Sets the name of the dog
 * @param newName a String that represents the dog's name
 */

public void setName(String newName){
    this.name = newName;
}

/**
 * Sets the breed of the dog
 * @param newBreed a String that represents the dog's breed 
 */

public void setBreed(String newBreed){
    this.breed = newBreed;
}

/**
 * Sets the dog's weight in pounds
 * @param newWeight a integer that represents the dog's weight in pounds
 */

public void setWeight(int newWeight){
    if (newWeight > 0){
        this.weight = newWeight;
        }
    }
}