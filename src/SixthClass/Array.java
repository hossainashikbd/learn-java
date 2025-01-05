package SixthClass;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[14];
        marks[0] = 5;
        marks[2] = 5;
        marks[13] = 23;

        System.out.println(marks[13]);
        System.out.println("Common for loop");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if (i < marks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("For each");
        String st = "";
        for (int m : marks) {
            st = st + m + ", ";
        }
        if (st.length() > 0) {
            st = st.substring(0, st.length() - 2);
        }
        System.out.print(st);
        System.out.println();
        System.out.println("Print with Arrays class");
        String result = Arrays.toString(marks);
        result = result.substring(1, result.length() - 1);
        System.out.println(result);
    }
}
