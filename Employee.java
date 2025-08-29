package Student;

public class Employee {
    private String firstName, lastName;
    private int myAge;
    private String myWork;

    Employee(String firstName, String lastName, int myAge, String myWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAge = myAge;
        this.myWork = myWork;
    }
    void fullName() {
        System.out.println("Hello there " + firstName + " " + lastName + "\n"
                + "You're " + myAge + " Years Old" + "\n"
                + "You're Work is " + myWork);
    }
}
