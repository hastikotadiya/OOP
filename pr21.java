import java.util.*;
class VotingApp {
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp app = new VotingApp();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            app.checkEligibility(age);

        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer!");
        } 
        finally {
            System.out.println("Validation process completed");
        }
    }
}
