package nl.furusupport.basic;

public class Main {

    public static void main(String[] args) {
        Car fiat = new Car("XX-SS-01", 2500, 10, 6, 1);

        System.out.println(fiat.calculateDepreciation(2000));



    }
}
