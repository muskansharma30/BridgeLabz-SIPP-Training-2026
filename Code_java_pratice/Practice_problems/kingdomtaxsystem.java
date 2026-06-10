//A kingdom's tax system charges 5% for income <10K, 15% for 10K–
//50K, 30% above 50K. Read a citizen's income, print tax bracket and
//amount. Extend: loop over an array of 10 citizens and tally total tax
//collected.
package Practice_problems;
import java.util.Scanner;

public class kingdomtaxsystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income:");
        double income = sc.nextDouble();

        double tax = 0;
        String bracket = "";

        if(income < 10000) {
            tax = income*0.5;
            bracket = "5% tax bracket";
        } else if(income <= 50000) {
            tax = income*0.15;
            bracket = "15% tax bracket";
        } else {
            tax = income*0.30;
            bracket = "30% tax bracket";
        }
        System.out.println("Tax Bracket: " + bracket);
        System.out.println("Tax Amount: " + tax);

        sc.close();
    }
}
