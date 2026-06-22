package gcr_codebase.control_flow.level1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {

            int factorial = 1;
            int i = 1;

            while (i <= num) {

                factorial =
                        factorial * i;

                i++;
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
