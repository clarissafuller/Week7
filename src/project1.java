import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
    //create a scanner
        Scanner input = new Scanner(System.in);
        //prompt user for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        //create an array of the size of students
        int[] scores = new int[numberOfStudents];
        //enter array values
        System.out.print("Enter " + numberOfStudents + " scores: ");

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        //look for best score in the array
        int best = scores[0];

        for (int i = 1; i < numberOfStudents; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        //loop through scores and assign grades
        for (int i = 0; i < numberOfStudents; i++) {
            char grade;

            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            //return results
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

    }
}