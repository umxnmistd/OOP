package OOP;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.print("Enter your Name: ");
                String name = scan.nextLine();

                System.out.print("Enter your Age: ");
                int age = scan.nextInt();

                Object person = new Object(name, age);
        }
}
