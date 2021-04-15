package nl.furusupport.basic;

public class Car extends Vehicle{

    private int maxNumberOfPassengers;
    private int numberOfPassengers;

    public Car(String licensePlate, double mileage, double pricePerKM, int maxNumberOfPassengers) {
        super(licensePlate, mileage, pricePerKM);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public double calculateDepreciation() {
        deprecation = 1 * (mileage/2000);
            return deprecation;
    }
}
