/**
 * The car class represents a car's manufacturer, model, year built, and price
 * @author Hailey Tam
 */

class Car {
    //instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructs a car object with a specific manufacturer, model, year built and price
     * @param make a String that represents the car's manufacturer
     * @param model a String that represents the car's model
     * @param year a integer that represents the year of when the car was built
     * @param price a double that represents the price of the car
     */

    //constructor
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * 
     * @return returns the value of make, which tells you who is the manufacturer of the car
     */

    public String getMake(){
        return this.make;
    }

    /**
     * 
     * @return returns the value of model, which tells you the model of the car
     */

    public String getModel(){
        return this.model;
    }

    /**
     * 
     * @return returns the value of year, which tells you what year the car was built
     */

    public int getYear(){
        return this.year;
    }

    /**
     * 
     * @return returns the value of price, which tells you cost of the car
     */

    public double getPrice(){
        return this.price;
    }

    /**
     * sets the value of the instance variable, make
     * @param newMake a string that will replace the value of make
     */
    
    public void setMake(String newMake){
        this.make = newMake;
    }

    /**
     * sets the value of the instance variable, model
     * @param newModel a string that will replace the value of model
     */

    public void setModel(String newModel){
        this.model = newModel;
    }

    /**
     * sets the value of the instance variable, year
     * @param newMake a integer that will replace the value of year if the integer is greater than zero
     */

    public void setYear(int newYear){
        if(newYear > 0){
            this.year = newYear;
        }
    }

    /**
     * sets the value of the instance variable, price
     * @param newPrice a double that will replace the value of price if the double is greater than or equal to zero
     */

    public void setPrice(double newPrice){
        if(newPrice >= 0){
            this.price = newPrice;
        }
    }
}
