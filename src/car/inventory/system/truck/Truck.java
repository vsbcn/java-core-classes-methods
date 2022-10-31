package car.inventory.system.truck;

import car.inventory.system.Car;

public class Truck  extends Car {
    //#3 - Car intentory system
    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    int towingCapacity;

    public Truck(String vinNumber, String make, String model, double mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }
}
