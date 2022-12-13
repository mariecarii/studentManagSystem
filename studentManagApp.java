import java.util.Scanner;

public class studentManagApp {

    public static void main(String[] args) {
        //ask how many students
        System.out.println("Enter number of new students: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student [] students = new Student[numOfStudents];

        //create # of students
        for (int i=0; i<numOfStudents; i++) {
            students[i] = new Student();
            students[i].showInfo();
            System.out.println();

        }



    }
}
