package oops.oopsProgrammingFundamental;

public class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.0;

    // Instance Variables
    int stationId;
    double unitsConsumed;

    // Constructor
    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }

    public static void main(String[] args) {

        oops.oopsProgrammingFundamental.ChargingStation s1 = new oops.oopsProgrammingFundamental.ChargingStation(101, 100);
        oops.oopsProgrammingFundamental.ChargingStation s2 = new oops.oopsProgrammingFundamental.ChargingStation(102, 120);
        oops.oopsProgrammingFundamental.ChargingStation s3 = new oops.oopsProgrammingFundamental.ChargingStation(103, 150);
        oops.oopsProgrammingFundamental.ChargingStation s4 = new oops.oopsProgrammingFundamental.ChargingStation(104, 180);
        oops.oopsProgrammingFundamental.ChargingStation s5 = new oops.oopsProgrammingFundamental.ChargingStation(105, 200);

        // Change electricity rate for all stations
        electricityRate = 10.0;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);
    }
}
