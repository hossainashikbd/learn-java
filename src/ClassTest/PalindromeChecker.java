package ClassTest;

public class PalindromeChecker {

    public static boolean isPalindrome(String str, int left, int right, int[] count) {

        count[0]++;

        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1, count);
    }
    public static void main(String[] args) {
        String input = "parves";
        int[] recursionCount = {0};

        String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean result = isPalindrome(sanitizedInput, 0, sanitizedInput.length() - 1, recursionCount);

        System.out.println("Is the string \"" + input + "\" a palindrome? " + result);
        System.out.println("Number of recursive calls: " + recursionCount[0]);
    }
}
