package oops.inheritance;

public class Vehicle {

    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(220, "Honda City");

        System.out.println("Electric Vehicle");
        System.out.println("Model: " + ev.model);
        System.out.println("Max Speed: " + ev.maxSpeed);
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");
        System.out.println("Model: " + pv.model);
        System.out.println("Max Speed: " + pv.maxSpeed);
        pv.refuel();
    }
}

interface Refuelable {

    void refuel();
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Vehicle is charging...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Vehicle is refueling...");
    }
}
