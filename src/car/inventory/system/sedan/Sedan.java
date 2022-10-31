package car.inventory.system.sedan;

import car.inventory.system.Car;

public class Sedan extends Car {
    //#3 - Car intentory system
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    private int numberOfDoors;

    public Sedan(String vinNumber, String make, String model, double mileage, int numberOfDoors) {
        super(vinNumber, make, model, mileage);
        setNumberOfDoors(numberOfDoors);
    }
}
