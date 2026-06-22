package OOPS.oops.oopsProgrammingFundamental;

public class BankAccount {

    int accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance in Account " + accountNumber);
        }
    }

    void getStatement() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Riya", 10000);
        BankAccount a2 = new BankAccount(102, "Aman", 15000);
        BankAccount a3 = new BankAccount(103, "Rohit", 20000);

        // 5 transactions for Account 1
        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);

        // 5 transactions for Account 2
        a2.deposit(1500);
        a2.withdraw(1000);
        a2.deposit(500);
        a2.withdraw(2000);
        a2.deposit(1000);

        // 5 transactions for Account 3
        a3.deposit(3000);
        a3.withdraw(1000);
        a3.deposit(2000);
        a3.withdraw(5000);
        a3.deposit(1000);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}

