package nl.furusupport.basic;

public class Car extends Vehicle{

    private int maxNumberOfPassengers;
    private int numberOfPassengers;

    public Car(String licensePlate, double mileage, double pricePerKM, int maxNumberOfPassengers, int numberOfPassengers) {
        super(licensePlate, mileage, pricePerKM);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public double calculateDepreciation(double distance) {
        deprecation = 1 * ((mileage + distance)/2000);
            return deprecation;
    }
}
