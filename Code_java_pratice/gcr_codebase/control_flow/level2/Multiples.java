package gcr_codebase.control_flow.level2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0 &&
                number < 100) {

            System.out.println(
                    "Multiples are:");

            for (int i = 100;
                 i >= 1;
                 i--) {

                if (i % number == 0) {

                    System.out.println(i);
                }
            }
        }

        else {

            System.out.println(
                    "Enter number between 1 and 99");
        }
    }
}
