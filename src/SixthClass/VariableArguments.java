package SixthClass;

public class VariableArguments {
    public static void main(String[] args) {
        // Corrected method call with semicolon
        int result = biggestNumber(567, 567, 13, 1000, 2);
        System.out.println("The biggest number is: " + result);
    }

    // Method to find the largest number from a variable number of arguments
    public static int biggestNumber(int... numbers) {
        int max = numbers[0]; // Start with the first number

        // Loop through the array of numbers to find the maximum
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max; // Return the largest number
    }
}


