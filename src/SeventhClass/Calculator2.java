import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");

        String input = scanner.nextLine().trim();

        String operator = "";
        int operatorIndex = -1;

        if (input.contains("+")) {
            operator = "+";
            operatorIndex = input.indexOf("+");
        } else if (input.contains("-")) {
            operator = "-";
            operatorIndex = input.indexOf("-");
        } else if (input.contains("*")) {
            operator = "*";
            operatorIndex = input.indexOf("*");
        } else if (input.contains("/")) {
            operator = "/";
            operatorIndex = input.indexOf("/");
        } else {
            System.out.println("Invalid input! Valid operators are +, -, *, /");
            return;
        }

        try {

            double num1 = Double.parseDouble(input.substring(0, operatorIndex));
            double num2 = Double.parseDouble(input.substring(operatorIndex + 1));
            double result = 0;


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


            if (result == (int) result) {

                System.out.println("Result: " + (int) result);
            } else {

                System.out.println("Result: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers! Please enter valid numeric values.");
        }
    }
}
