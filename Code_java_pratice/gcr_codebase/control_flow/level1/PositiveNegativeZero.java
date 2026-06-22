package gcr_codebase.control_flow.level1;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        }

        else if (number < 0) {
            System.out.println("Negative");
        }

        else {
            System.out.println("Zero");
        }
    }
}
