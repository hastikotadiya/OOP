import java.util.*;
class Employee {
    String name;
    String department;

    void setDetails(String name, String dept) {
        this.name = name;
        this.department = dept;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    void setManagerDetails(String name, String dept, int size, String project) {
        this.name = name;
        this.department = dept;
        this.teamSize = size;
        this.projectName = project;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class pr15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        emp.setDetails(name, dept);

        Manager mgr = new Manager();
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Department: ");
        String mDept = sc.nextLine();
        System.out.print("Team Size: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Project Name: ");
        String project = sc.nextLine();
        mgr.setManagerDetails(mName, mDept, size, project);

        System.out.println("\n--- Displaying Employee Details ---");
        emp.displayDetails();

        System.out.println("\n--- Displaying Manager Details ---");
        mgr.displayDetails();

        System.out.println("\n--- Runtime Polymorphism Demo ---");
        Employee ref;

        ref = emp;   
        ref.displayDetails();  
        ref = mgr;  
        ref.displayDetails();  
    }
}
