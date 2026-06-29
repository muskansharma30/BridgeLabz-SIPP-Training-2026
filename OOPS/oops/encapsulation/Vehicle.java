package oops.encapsulation;

public abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Setters
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Abstract Method
    abstract double calculateRentalCost(int days);

    // Concrete Method
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    public static void main(String[] args) {

        Car car = new Car("CAR101", "Car", 1500);
        Bike bike = new Bike("BIKE101", "Bike", 500);
        Truck truck = new Truck("TRUCK101", "Truck", 3000, 2000);

        int days = 5;

        System.out.println("----- Car -----");
        car.displayVehicleInfo();
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("----- Bike -----");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("----- Truck -----");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost: " + truck.calculateRentalCost(days));
    }
}

class Car extends Vehicle {

    private double dailyRate;

    public Car(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public Bike(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public Truck(String vehicleNumber, String vehicleType,
                 double dailyRate, double loadingCharge) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}
