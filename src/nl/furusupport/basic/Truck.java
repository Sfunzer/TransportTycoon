package nl.furusupport.basic;

public class Truck extends Vehicle {
    public Truck(String licensePlate, double mileage, double pricePerKM) {
        super(licensePlate, mileage, pricePerKM);

    }

    @Override
    public double calculateDepreciation(double distance) {
        if (mileage >= 3000) {
            deprecation = 1 * ((mileage + distance)/ 3000);
        }
        return deprecation;
    }
}