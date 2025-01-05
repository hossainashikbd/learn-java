package TwentyThreeClass;

import java.util.Scanner;

public class NextInteger {

    public static int addition(int num) {
        return ++num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("The next integer is: " + addition(num));

        scanner.close();
    }
}
