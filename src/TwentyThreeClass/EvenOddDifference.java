package TwentyThreeClass;

public class EvenOddDifference {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 43, 56, 85, 98};
        calculateAndDisplaySums(numbers);
    }

    public static void calculateAndDisplaySums(int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("The difference between the sum of even and odd numbers is: " + (evenSum - oddSum));
    }
}
