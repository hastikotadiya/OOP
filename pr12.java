import java.util.*;
class VolumeCalculator {
    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    double calculateVolume(double radius, int choice) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();
        System.out.println("Choose Shape:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt()
        switch (ch) {
            case 1:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Volume of Cube: " + obj.calculateVolume(side));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                System.out.println("Volume of Rectangular Cube: " + obj.calculateVolume(l, w, h));
                break;

            case 3:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Volume of Sphere: " + obj.calculateVolume(r, 1));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
