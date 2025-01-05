import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int number) {
           if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, hence not prime
            }
        }
        return true; // number is prime
    }
    // Main method to prompt user for input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        try {
             int number = Integer.parseInt(userInput);
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
        scanner.close();
    }
}
