package gcr_codebase.control_flow.level2;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Amar age: ");
        int aAge = sc.nextInt();

        System.out.print("Akbar age: ");
        int bAge = sc.nextInt();

        System.out.print("Anthony age: ");
        int cAge = sc.nextInt();

        System.out.print("Amar height: ");
        double aHeight = sc.nextDouble();

        System.out.print("Akbar height: ");
        double bHeight = sc.nextDouble();

        System.out.print("Anthony height: ");
        double cHeight = sc.nextDouble();

        // Youngest

        if (aAge < bAge &&
                aAge < cAge)
            System.out.println(
                    "Youngest: Amar");

        else if (bAge < cAge)
            System.out.println(
                    "Youngest: Akbar");

        else
            System.out.println(
                    "Youngest: Anthony");

        // Tallest

        if (aHeight > bHeight &&
                aHeight > cHeight)
            System.out.println(
                    "Tallest: Amar");

        else if (bHeight > cHeight)
            System.out.println(
                    "Tallest: Akbar");

        else
            System.out.println(
                    "Tallest: Anthony");
    }
}
