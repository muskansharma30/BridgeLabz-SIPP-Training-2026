package oops.encapsulation;

public class Package {

    // Private attributes (Encapsulation)
    private String trackingId;
    private double weight;

    // Constructor
    public Package(String trackingId, double weight) {
        this.trackingId = trackingId;

        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be greater than 0.0");
            this.weight = 1.0; // default value
        }
    }

    // Getter for trackingId
    public String getTrackingId() {
        return trackingId;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter with validation
    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Invalid weight! Weight unchanged.");
        }
    }
}

// Subclass using Inheritance
class ExpressPackage extends Package {

    private String priorityLevel;

    // Constructor
    public ExpressPackage(String trackingId, double weight,
                          String priorityLevel) {
        super(trackingId, weight);
        this.priorityLevel = priorityLevel;
    }

    // Getter
    public String getPriorityLevel() {
        return priorityLevel;
    }

    // Method to print shipping label
    public void printShippingLabel() {
        System.out.println("===== SHIPPING LABEL =====");
        System.out.println("Tracking ID : " + getTrackingId());
        System.out.println("Weight      : " + getWeight() + " kg");
        System.out.println("Priority    : " + priorityLevel);
        System.out.println("==========================");
    }
}

// Main Class
    class Main {
    public static void main(String[] args) {

        // Scenario A (Valid)
        ExpressPackage p1 =
                new ExpressPackage("EXP101", 2.5, "Critical");

        p1.printShippingLabel();

        System.out.println();

        // Scenario B (Invalid weight)
        p1.setWeight(-1.5);

        System.out.println("Current Weight: "
                + p1.getWeight() + " kg");
    }
}
