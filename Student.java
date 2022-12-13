import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int balance;
    private int costPerCourse = 600;

    // constructor to enter name and year
    public Student() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scan.nextLine();

        System.out.println("Enter year: ");
        this.gradeYear = scan.nextInt();
        System.out.println(firstName + lastName + gradeYear);




    }
    // generate a 5 digit ID

    // enroll in courses

    // view balance and pay tuition

    // shows status/info
}
