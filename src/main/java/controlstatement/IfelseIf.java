package controlstatement;

import java.util.Scanner;

public class IfelseIf {
    public static void main(String[] args) {
        int studentMarks;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student marks");
        studentMarks = scanner.nextInt();

        if (studentMarks > 80 && studentMarks <= 100) {
            System.out.println("Student grade is A");
        }
            else if (studentMarks > 60 && studentMarks <= 80) {
                System.out.println("Student grade is B");

            } else if (studentMarks > 50 && studentMarks <= 60) {
                System.out.println("Student grade is C");

            } else if (studentMarks > 45 && studentMarks <= 50) {
                System.out.println("Student grade is D");

            } else if (studentMarks > 25 && studentMarks <= 45) {
                System.out.println("Student grade is E");
            } else if (studentMarks < 25 && studentMarks <= 0) {
                System.out.println("Student grade is E");
            }
            else{
            System.out.println("please check the marks again");
        }
    }
}