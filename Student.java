import java.util.ArrayList;
import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    // static because it is no specific to instance, but all
    private int balance = 0;
    private int costPerCourse = 600;

    // constructor to enter name and year
    public Student() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scan.nextLine();

        System.out.println("Enter year: ");
        this.gradeYear = scan.nextLine();

        this.studentID = setStudentID();

        this.courses = enroll();


        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID + " " + courses + balance);
    }

    // generate a 5 digit ID
    private String setStudentID() {
        // start id with grade year entered
        String newID = gradeYear;
        int length = gradeYear.length();

        //fill in rest of id (up tp length of 5) with random numbers
        String numberSet = "1234567890";
        char[] id = new char[5 - length];
        for (int i = 0; i < 5 - length; i++) {
            int random = (int) (Math.random() * numberSet.length());
            id[i] = numberSet.charAt(random);
        }

        newID += String.valueOf(id);
        return newID;

    }


    // enroll in courses
    public String enroll() {
        System.out.println("Enter course to enroll (ONE AT A TIME):\n 1. Machine Learning\n 2. AP Java\n 3. IT\n 4. AWS\n 5. EXIT/DONE ");
        Scanner scan = new Scanner(System.in);
        int userInputCourse = scan.nextInt();

        if (userInputCourse == 1 || userInputCourse == 2 || userInputCourse == 3 || userInputCourse == 4) {
            // increment tuition balance by 600 each time a class is added
            balance += costPerCourse;
            if (userInputCourse == 1) {
                courses += "Machine Learning ";
                enroll();
            }
            else if (userInputCourse == 2) {
                courses += "AP Java ";
                enroll();
            }
            else if (userInputCourse == 3) {
                courses += "IT ";
                enroll();
            }
            else if (userInputCourse == 4) {
                courses += "AWS ";
                enroll();
            }
        else if (userInputCourse == 5) {
            return courses;
            }
        else {
                System.out.println("Invalid");
            }
        }
        return courses;
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    //  pay tuition
    public void payTuition() {
        System.out.println("Enter payment amount:");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        balance -= payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }
    // shows status/info
}
