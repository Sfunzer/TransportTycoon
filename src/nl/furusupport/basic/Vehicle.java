package nl.furusupport.basic;

public abstract class Vehicle {

    private String licensePlate;
    protected double deprecation = 0.0;
    protected double mileage = 0;
    private double pricePerKM;

    public Vehicle(String licensePlate, double mileage, double pricePerKM) {
        this.licensePlate = licensePlate;
        this.mileage = mileage;
        this.pricePerKM = pricePerKM;

    }

    public void drive(double kiloMeters){
        mileage = mileage + kiloMeters;
    }

    public abstract double calculateDepreciation(double distance);
}
