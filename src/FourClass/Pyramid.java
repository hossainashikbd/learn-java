import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows in the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner object
        scanner.close();
    }
}
