package OPERATORS;

public class addition {

    int numOne;
    char operator;
    int numTwo;

    addition (int numOne, char operator, int numTwo) {
            this.numOne = numOne;
            this.operator = operator;
            this.numTwo = numTwo;
    }

    void answer () {
            if (operator == '+') {
                System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));

            }
            else {
                System.out.println("INVALID INPUT");
            }
    }

}
