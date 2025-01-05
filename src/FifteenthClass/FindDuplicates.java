package FifteenthClass;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 4, 2, 7, 3, 6, 9, 4, 8};


        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();


        for (int num : array) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate values in the array: " + duplicates);
        }
    }
}

