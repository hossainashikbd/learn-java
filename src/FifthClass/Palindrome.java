package FifthClass;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int low = 0;  // Start from the beginning of the string
        int high = s.length() - 1;  // Start from the end of the string

        boolean isPalindrome = true;  // Assume it's a palindrome initially

        // Check characters from both ends of the string
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;  // Not a palindrome
                break;  // No need to continue if a mismatch is found
            }
            low++;
            high--;
        }

        // Output the result
        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
