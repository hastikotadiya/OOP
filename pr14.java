import java.util.*;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.println("Account Opened Successfully!\n");
    }
    void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount Deposited!\n");
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!\n");
        } else {
            System.out.println("Insufficient Balance!\n");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance + "\n");
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 5.0;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned: " + interest + "\n");
    }
}

class FixedDepositAccount extends BankAccount {
    double rate = 7.0;

    void maturityAmount(Scanner sc) {
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double maturity = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Maturity Amount: " + maturity + "\n");
    }
}

public class pr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Account Type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        BankAccount acc;

        if (choice == 1) {
            acc = new SavingAccount();
        } else if (choice == 2) {
            acc = new FixedDepositAccount();
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        acc.openAccount(sc);

        int option;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");

            if (acc instanceof SavingAccount) {
                System.out.println("4. Calculate Interest");
            } else if (acc instanceof FixedDepositAccount) {
                System.out.println("4. Calculate Maturity Amount");
            }

            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    acc.deposit(sc);
                    break;
                case 2:
                    acc.withdraw(sc);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    if (acc instanceof SavingAccount) {
                        ((SavingAccount) acc).calculateInterest();
                    } else if (acc instanceof FixedDepositAccount) {
                        ((FixedDepositAccount) acc).maturityAmount(sc);
                    }
                    break;
                case 0:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option!\n");
            }

        } while (option != 0);
    }
}
