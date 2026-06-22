package gcr_codebase.control_flow.level1;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {

            int factorial = 1;

            for (int i = 1; i <= num; i++) {

                factorial =
                        factorial * i;
            }

            System.out.println(
                    "Factorial = "
                            + factorial);
        }

        else {

            System.out.println(
                    "Factorial not possible for negative numbers");
        }
    }
}
