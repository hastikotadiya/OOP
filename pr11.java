import java.util.*;
class College {
    String collegeName;
    College(String collegeName) {
        this.collegeName = collegeName;
    }
    class Admission {
        String studentName;
        String course;
        void acceptData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }
        void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); 
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
    public static void main(String[] args) {
        College college = new College("ABC College");
        College.Admission admission = college.new Admission();
        admission.acceptData();
        admission.displayData();
    }
}
