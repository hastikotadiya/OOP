import java.util.*;

public class pr3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a letter.");
        }
    }
}
// output
// Enter a single letter: A
// It is a vowel.
