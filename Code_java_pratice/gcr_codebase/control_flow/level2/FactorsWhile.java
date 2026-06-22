package gcr_codebase.control_flow.level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {

            int counter = 1;

            System.out.println("Factors:");

            while (counter < number) {

                if (number % counter == 0) {

                    System.out.println(counter);
                }

                counter++;
            }
        }

        else {

            System.out.println(
                    "Enter positive integer");
        }
    }
}
