import java.util.ArrayList;
import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses;
    // static because it is no specific to instance, but all
    private  static int balance;
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

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // generate a 5 digit ID
    private String setStudentID() {
        // start id with grade year entered
        String newID = gradeYear;
        int length = gradeYear.length();

        //fill in rest of id (up tp length of 5) with random numbers
        String numberSet = "1234567890";
        char[] id = new char[5-length];
        for (int i=0; i<5-length; i++) {
            int random = (int) (Math.random() * numberSet.length());
            id[i] = numberSet.charAt(random);
        }

        newID += String.valueOf(id);
        return newID;

    }
    }




    // enroll in courses

    // view balance and pay tuition

    // shows status/info

