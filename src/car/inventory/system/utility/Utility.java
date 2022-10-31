package car.inventory.system.utility;

import car.inventory.system.Car;

public class Utility extends Car {
    //#3 - Car intentory system
    private boolean fourWheelDrive;

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public Utility(String vinNumber, String make, String model, double mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }
}
