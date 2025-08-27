package OPERATORS;

public class multiplication extends addition {
    multiplication(int numOne, char operator, int numTwo) {
        super (numOne, operator, numTwo);
    }
    void answer() {
        if (operator == '*') {
            System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
        }
    }
}
