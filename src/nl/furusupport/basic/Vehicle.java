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
        calculateDepreciation();
    }

    protected abstract double calculateDepreciation();
        //removed distance as a method variable as it is not needed to calculate the depreciation.


    public double getDeprecation() {
        return deprecation;
    }
}
