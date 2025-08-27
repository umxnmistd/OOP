package OPERATORS;
import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Number: ");
        int numOne = scan.nextInt();

        System.out.print("Enter your Operator: ");
        char operator = scan.next().charAt(0);

        System.out.print("Enter your First Number: ");
        int numTwo = scan.nextInt();

        addition add = new addition(numOne, operator, numTwo);
        subtraction minus = new subtraction(numOne, operator, numTwo);
        multiplication times = new multiplication(numOne, operator, numTwo);
        division divide = new division(numOne, operator, numTwo);

        switch (operator) {
            case '+' : add.answer(); break;
            case '-' : minus.answer(); break;
            case '*' : times.answer(); break;
            case '/' : divide.answer(); break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
