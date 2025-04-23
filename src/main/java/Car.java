/**
 * The car class represents a car's manufacturer, model, year built, and price
 * @author Hailey Tam
 */

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructs a car with a specific manufacturer, model, year built and price
     * @param make a String that represents the car's manufacturer
     * @param model a String that represents the car's model
     * @param year a integer that represents the year of when the car was built
     * @param price a double that represents the price of the car
     */

    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Gets the car's manufacturer
     * @return returns the value of make as a String representing the car's manufacturer
     */

    public String getMake(){
        return this.make;
    }

    /**
     * Gets the car's model
     * @return returns the value of model as a String, which represents the model of the car
     */

    public String getModel(){
        return this.model;
    }

    /**
     * Gets the year the car was produced
     * @return returns the value of year as an integer that represents the year the car was built
     */

    public int getYear(){
        return this.year;
    }

    /**
     * Gets the price of the car
     * @return returns the value of price as a double, which represents cost of the car
     */

    public double getPrice(){
        return this.price;
    }

    /**
     * Sets the car's manufacturer 
     * @param newMake a String containing the car's manufacturer
     */
    
    public void setMake(String newMake){
        this.make = newMake;
    }

    /**
     * Sets the car's model
     * @param newModel a String containing the car's model
     */

    public void setModel(String newModel){
        this.model = newModel;
    }

    /**
     * Sets the year of when the car was produced
     * @param newYear a integer containing the year that the car was produced
     *                only if the value is greater than 0
     */

    public void setYear(int newYear){
        if(newYear > 0){
            this.year = newYear;
        }
    }

    /**
     * Sets the price of the car
     * @param newPrice a double containing the price of the car
     *                  only if the double is greater than or equal to zero
     */

    public void setPrice(double newPrice){
        if(newPrice >= 0){
            this.price = newPrice;
        }
    }
}
