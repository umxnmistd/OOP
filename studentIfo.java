package OOP;

public class studentInfo {
    String firstName, lastName, course, section;
    int year, midtermGrade, finalGrade;

    Object(String firstName, String lastName,int year, String course, String section, int midtermGrade, int finalGrade ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }
    void fullName() {
        System.out.println("You are " + firstName + " " + lastName);
    }
    void studentCourse() {
        System.out.println("You're Course is " + course);
    }
    void studentYearSection() {
        System.out.println("You are in Section " + section);
    }
    void studentGrade() {
        int average = (midtermGrade + finalGrade)/2;
        if (average >= 98 && average <= 99) {
            System.out.println("With Highest Honors");
        } else if (average >= 95 && average <= 97) {
            System.out.println("With High Honors");
        } else if (average >= 90 && average <= 94) {
            System.out.println("With Honors");
        } else if (average >= 75) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
        System.out.println("Your Grade is  " + average );
    }
    void schoolYear() {
        System.out.println("School Year " + year );
    }
}
