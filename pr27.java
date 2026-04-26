import java.io.*;
import java.util.Scanner;
public class pr27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter("students.txt");
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); 
            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details of student " + i);

                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                fw.write(roll + " " + name + " " + marks + "\n");
            }
            System.out.println("\nData written successfully\n");
        } catch (IOException e) {
            System.out.println("Error while writing file");
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.out.println("Error closing FileWriter");
            }
        }
        try {
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader");
            }
        }
        sc.close();
    }
}
