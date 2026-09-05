package oops.polymorphism;

public class Vehicle {

    double fuelCost(int km) {
        return 0;
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 100;

        for (Vehicle v : vehicles) {

            System.out.println("Vehicle: " + v.getClass().getSimpleName());
            System.out.println("Fuel Cost: " + v.fuelCost(km));

            if (v instanceof Car) {
                System.out.println("This is a Car");
            } else if (v instanceof Bus) {
                System.out.println("This is a Bus");
            } else if (v instanceof Bike) {
                System.out.println("This is a Bike");
            } else if (v instanceof ElectricCar) {
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}

class Car extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}
