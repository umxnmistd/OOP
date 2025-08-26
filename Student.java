package OOP;
import java.util.Scanner;

public class Student {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.print("Enter your First Name: ");
                String firstName = scan.nextLine();

                System.out.print("Enter your Last Name: ");
                String lastName = scan.nextLine();

                System.out.print("Enter your School Year: ");
                int year = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter your Course: ");
                String course = scan.nextLine();

                System.out.print("Enter your Section: ");
                String section = scan.nextLine();

                System.out.print("Enter your MidTerm Grade: ");
                int midTerm = scan.nextInt();

                System.out.print("Enter your Final Grade: ");
                int finalTerm = scan.nextInt();


                Object student = new Object(firstName, lastName, year, course, section, midTerm, finalTerm);

                student.fullName();
                student.studentCourse();
                student.studentYearSection();
                student.studentGrade();
                student.schoolYear();

                //Object student = new Object("Joel", "Sulit", 2007, "BSIT", "1-10", 1, 2);

        }
}
