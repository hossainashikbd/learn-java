package TwentyThreeClass;

import java.util.HashSet;

public class ConsecutiveArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 3, 2};
        if (canFormConsecutive(numbers)) {
            System.out.println("The elements can be rearranged to form a consecutive list.");
        } else {
            System.out.println("The elements cannot be rearranged to form a consecutive list.");
        }
    }

    public static boolean canFormConsecutive(int[] numbers) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                return false;
            }
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max - min == numbers.length - 1) {
            return true;
        }

        return false;
    }
}
