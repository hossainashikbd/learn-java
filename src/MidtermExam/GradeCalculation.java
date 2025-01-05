package MidtermExam;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        double number = scanner.nextDouble();

        if (number < 0 || number > 100) {
            System.out.println("Invalid input. Number must be between 0 and 100.");
        } else {

            String grade;
            if (number >= 90) {
                grade = "A+";
            } else if (number >= 70) {
                grade = "A";
            } else if (number >= 60) {
                grade = "B";
            } else {
                grade = "Failed";
            }

            System.out.println("The grade is: " + grade);
        }
        scanner.close();
    }
}
