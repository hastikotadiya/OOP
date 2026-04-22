import java.util.*;
public class pr2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        System.out.print("Enter coefficient d: ");
        double d = sc.nextDouble();
        System.out.print("Enter constant e: ");
        double e = sc.nextDouble();
        System.out.print("Enter constant f: ");
        double f = sc.nextDouble();
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);
        if (D == 0) {
            System.out.println("No unique solution exists (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("Value of x: %.2f\n", x);
            System.out.printf("Value of y: %.2f\n", y);
        }
    }
}
//output
// Enter coefficient a: 2
// Enter coefficient b: 3
// Enter coefficient c: 1
// Enter coefficient d: 2
// Enter constant e: 8
// Enter constant f: 5
// Value of x: 1.00
// Value of y: 2.00
