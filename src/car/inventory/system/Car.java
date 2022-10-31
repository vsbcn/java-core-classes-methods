package car.inventory.system;

public abstract class Car {
    //#3 - Car intentory system
    private String vinNumber;
    private String make;
    private String model;
    private double mileage;

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Car(String vinNumber, String make, String model, double mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }
}
