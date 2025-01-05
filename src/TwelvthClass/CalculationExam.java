package TwelvthClass;

import java.util.Scanner;

public class CalculationExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter midterm score (out of 50): ");
        float midterm_score = scanner.nextFloat();

        System.out.print("Enter final exam score (out of 50): ");
        float final_exam_score = scanner.nextFloat();

        float total_score = (midterm_score * 0.2f) + (final_exam_score * 0.8f);


        if (total_score > 30) {
            System.out.println( total_score + " Pass ");
        } else {
            System.out.println(total_score + " Fail ");
        }

        scanner.close();
    }
}
