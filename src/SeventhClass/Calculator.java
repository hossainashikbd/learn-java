import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");

        String input = scanner.nextLine();

        // Split the input into numbers and operator
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input format! Correct format: number operator number");
            return;
        }

        try {
            double num1 = Double.parseDouble(parts[0]); // First number
            String operator = parts[1];                // Operator
            double num2 = Double.parseDouble(parts[2]); // Second number
            double result = 0;
            // Perform calculation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Unknown operator! Valid operators: +, -, *, /");
                    return;
            }

            // Display the result
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers!");
        }
    }
}
