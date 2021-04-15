package nl.furusupport.basic;

public class Main {

    public static void main(String[] args) {
        Car fiat = new Car("XX-SS-01", 0, 10, 6);

        fiat.drive(2000);

        System.out.println(fiat.getDeprecation());

        Truck volvo = new Truck("PP-IZ-ZA", 0, 50, 16000, 6000);

        volvo.setCargoWeight(10000);
        volvo.drive(3000);

        System.out.println(volvo.getDeprecation());

        volvo.setCargoWeight(16000);
        volvo.drive(3000);

        System.out.println(volvo.getDeprecation());



    }
}
