package gcr_codebase.control_flow.level1;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check Natural Number
        if (n >= 0) {

            // Sum using while loop
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Sum using formula
            int sumFormula =
                    n * (n + 1) / 2;

            // Print Results
            System.out.println(
                    "Sum using while loop = "
                            + sumWhile);

            System.out.println(
                    "Sum using formula = "
                            + sumFormula);

            // Compare Results
            if (sumWhile == sumFormula) {

                System.out.println(
                        "Both computations are correct");
            }

            else {

                System.out.println(
                        "Results are not equal");
            }
        }

        else {

            System.out.println(
                    "The number "
                            + n +
                            " is not a natural number");
        }
    }
}