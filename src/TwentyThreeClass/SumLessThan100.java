package TwentyThreeClass;

import java.util.Scanner;

public class SumLessThan100 {

    public static boolean isSumLessThan100(int a, int b) {
        return (a + b) < 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Is the sum less than 100? " + isSumLessThan100(a, b));

        scanner.close();
    }
}
