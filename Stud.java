package Student;
import java.util.Scanner;

public class Stud {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of Workers: ");
        int size = scan.nextInt();
        scan.nextLine();

        Employee workers[] = new Employee[size];

        for (int i = 0; i < workers.length; i++) {

            String firstName, lastName;
            int myAge;
            String myWork;

            System.out.println("Workers Number: " + (i + 1));
            System.out.println();

            System.out.print("Enter your First Name: ");
            firstName = scan.nextLine();

            System.out.print("Enter your Last Name: ");
            lastName = scan.nextLine();

            System.out.print("Enter your Age: ");
            myAge = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter your Work: ");
            myWork = scan.nextLine();

            System.out.println();

            workers[i] = new Employee(firstName, lastName, myAge, myWork);
        }

        for (Employee emp:workers) {
            emp.fullName();
            System.out.println();
        }
    }
}
