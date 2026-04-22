import java.util.*;
class BankAccount {
    String accountHolderName;
    double balance;
    static double interestRate;
    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }
    double calculateInterest() {
        return balance * interestRate / 100;
    }
    void displayInterest() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();
        BankAccount.updateInterestRate(rate);
        System.out.print("\nEnter Account Holder Name 1: ");
        sc.nextLine(); 
        String name1 = sc.nextLine();
        System.out.print("Enter Balance 1: ");
        double bal1 = sc.nextDouble();
        System.out.print("\nEnter Account Holder Name 2: ");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.print("Enter Balance 2: ");
        double bal2 = sc.nextDouble();
        BankAccount acc1 = new BankAccount(name1, bal1);
        BankAccount acc2 = new BankAccount(name2, bal2);
        acc1.displayInterest();
        acc2.displayInterest();
    }
}
