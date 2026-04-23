abstract class Vehicle {
        abstract String fuelType();
        abstract int noOfWheels();
}
class Car extends Vehicle {
    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }
    @Override
    int noOfWheels() {
        return 4;
    }
}
class Bike extends Vehicle {
    @Override
    String fuelType() {
        return "Petrol";
    }
    @Override
    int noOfWheels() {
        return 2;
    }
}
public class pr18{
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println();

        System.out.println("Bike Details:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}
