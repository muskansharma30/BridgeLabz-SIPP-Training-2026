package oops.polymorphism;
import java.util.Scanner;

// Superclass
public class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void displayDetails(int overdueDays) {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Fine: ₹" + calculateFine(overdueDays));
    }
}

// Student Member
class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2; // ₹2/day
    }
}

// Faculty Member
class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1; // ₹1/day
    }
}

// Guest Member
class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5; // ₹5/day
    }
}

// Main Class
    class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryMember[] members = new LibraryMember[3];

        // Store members
        members[0] = new StudentMember("Muskan", "S101");
        members[1] = new FacultyMember("Riya", "F102");
        members[2] = new GuestMember("Aman", "G103");

        System.out.print("Enter overdue days: ");
        int overdueDays = sc.nextInt();
        sc.nextLine();

        // Display all members
        System.out.println("\nMember Details:");
        for (LibraryMember m : members) {
            m.displayDetails(overdueDays);
            System.out.println();
        }

        // Search by ID
        System.out.print("Enter Member ID to search: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equalsIgnoreCase(searchId)) {
                System.out.println("\nMember Found:");
                m.displayDetails(overdueDays);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member ID not found.");
        }

        sc.close();
    }
}
