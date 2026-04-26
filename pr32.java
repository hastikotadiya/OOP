import java.util.*;
public class pr32{
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        System.out.print("Enter number of roll numbers: ");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.print("Enter roll number " + i + ": ");
            rollNumbers.add(sc.nextInt());
        }
        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();
        boolean rollFound = searchElement(rollNumbers, searchRoll);
        System.out.println("Roll number found: " + rollFound);
        sc.nextLine(); 
        LinkedList<String> names = new LinkedList<>();
        System.out.print("\nEnter number of names: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n2; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean nameFound = searchElement(names, searchName);
        System.out.println("Name found: " + nameFound);
    }
}
