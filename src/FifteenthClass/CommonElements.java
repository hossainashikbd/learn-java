package FifteenthClass;

import java.util.HashSet;
import java.util.Set;

    public class CommonElements {
        public static void main(String[] args) {

            String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
            String[] array2 = {"grape", "banana", "kiwi", "cherry", "orange"};

            findCommonElements(array1, array2);
        }

        public static void findCommonElements(String[] array1, String[] array2) {

            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();


            for (String s : array1) {
                set1.add(s);
            }

            for (String s : array2) {
                set2.add(s);
            }

            set1.retainAll(set2);


            if (set1.isEmpty()) {
                System.out.println("No common elements found.");
            } else {
                System.out.println("Common elements: " + set1);
            }
        }
    }
