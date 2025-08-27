package OPERATORS;

public class division extends addition{
    division(int numOne, char operator, int numTwo) {
        super (numOne, operator, numTwo);
    }
    void answer() {
        if (operator == '/') {
            System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
        }
    }
}
