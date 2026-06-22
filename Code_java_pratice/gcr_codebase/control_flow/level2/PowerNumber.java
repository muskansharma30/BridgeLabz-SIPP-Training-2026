package gcr_codebase.control_flow.level2;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (number >= 0 &&
                power >= 0) {

            int result = 1;

            for (int i = 1;
                 i <= power;
                 i++) {

                result =
                        result * number;
            }

            System.out.println(
                    number +
                            "^" +
                            power +
                            " = " +
                            result);
        }

        else {

            System.out.println(
                    "Enter positive integers");
        }
    }
}
