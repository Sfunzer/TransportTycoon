package nl.furusupport.basic;

public class Truck extends Vehicle {
    private double maxCargoWeight;
    private double maxCargoVolume;
    private double cargoWeight;
    private double cargoSize;

    public Truck(String licensePlate, double mileage, double pricePerKM, double maxCargoWeight, double maxCargoVolume) {
        super(licensePlate, mileage, pricePerKM);
        this.maxCargoWeight = maxCargoWeight;
        this.maxCargoVolume = maxCargoVolume;


    }

    @Override
    public double calculateDepreciation() {
        double over90Capacity = (maxCargoWeight/100)*90;

        if (mileage >= 3000 && cargoWeight >= over90Capacity && cargoWeight <= maxCargoWeight) {
            deprecation = 1.5 * (mileage/ 3000);

        } else if (mileage >= 3000)  {
            deprecation = 1 * (mileage/ 3000);
        }

        return deprecation;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}