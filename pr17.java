import java.util.*;
interface Exam {
    boolean isPassed(int mark);
}
interface Classify {
    String getDivision(double average);
}
class Result implements Exam, Classify {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40;
    }
    @Override
    public String getDivision(double average) {
        if (average >= 75) {
            return "Distinction";
        } else if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        }else{
          return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result studentResult = new Result();

        System.out.print("Enter mark: ");
        int testMark = sc.nextInt();

        System.out.print("Enter average: ");
        double testAverage = sc.nextDouble();

        boolean status = studentResult.isPassed(testMark);
        System.out.println("Mark: " + testMark);
        System.out.println("Passed: " + status);

        String division = studentResult.getDivision(testAverage);
        System.out.println("Average: " + testAverage);
        System.out.println("Division: " + division);
    }
}
