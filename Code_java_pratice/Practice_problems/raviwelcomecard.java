//Ravi just joined a coding guild. Store his name, age, rank, salary, and
//membership fee (float) using correct data types. Compute his
//annual bonus (12% of salary), cast it to int, and print a formatted
//welcome card.
package Practice_problems;

public class raviwelcomecard {
    public static void main(String[] args) {
        String name="Ravi";
        int age=22;
        int Rank=23;
        double salary= 50000;
        float membershipFee= 500;
        int AnnualBonus= (int)(salary*12/100);
        System.out.println("Rank:"+ Rank);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
        System.out.println("MembershipFee:"+membershipFee);
        System.out.println("Annual Bonus:"+AnnualBonus);
    }
}