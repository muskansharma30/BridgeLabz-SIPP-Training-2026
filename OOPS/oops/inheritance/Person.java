package oops.inheritance;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name = " + name;
    }

    public static void main(String[] args) {

        GradStudent g = new GradStudent(
                "Riya",
                101,
                9.2,
                "AI in Education"
        );

        System.out.println(g);

        // IS-A Relationship
        Person p = g;
        Student s = g;

        System.out.println("\nGradStudent IS-A Student: " + (s instanceof Student));
        System.out.println("GradStudent IS-A Person: " + (p instanceof Person));
    }
}

class Student extends Person {

    final int studentId;
    double gpa;

    public Student(String name, int studentId, double gpa) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                ", Student ID = " + studentId +
                ", GPA = " + gpa;
    }
}

class GradStudent extends Student {

    String thesis;

    public GradStudent(String name, int studentId,
                       double gpa, String thesis) {

        super(name, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                ", Thesis = " + thesis;
    }
}
