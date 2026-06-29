package oops.encapsulation;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract Method
    abstract double calculateBill();

    // Concrete Method
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        InPatient p1 = new InPatient(
                101, "Riya", 21,
                5000, 3000
        );

        OutPatient p2 = new OutPatient(
                102, "Aman", 25,
                800, 1200
        );

        System.out.println("----- In Patient -----");
        p1.displayPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());

        System.out.println();

        System.out.println("----- Out Patient -----");
        p2.displayPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
    }
}

class InPatient extends Patient {

    private double roomCharges;
    private double treatmentCharges;

    public InPatient(int patientId, String name, int age,
                     double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {

    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(int patientId, String name, int age,
                      double consultationFees, double treatmentCharges) {
        super(patientId, name, age);
        this.consultationFees = consultationFees;
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}
