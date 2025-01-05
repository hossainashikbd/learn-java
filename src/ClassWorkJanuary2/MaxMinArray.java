package ClassWorkJanuary2;

public class MaxMinArray {
    public static void main(String[] args) {

        int[] array = {45, 12, 78, 34, 89, 23, 56, 98, 13};

        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
