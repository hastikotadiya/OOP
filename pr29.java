import java.util.*;
public class pr29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks.add(sc.nextInt());
        }
        System.out.println("\nMarks: " + marks);
        int max = Collections.max(marks);
        int min = Collections.min(marks);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
