package EighteenClass;

import java.math.BigInteger;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        int count = 5;
        System.out.print(BigInteger.ZERO + " " + BigInteger.ONE);
        printFibonacci(BigInteger.ZERO, BigInteger.ONE, count - 2);
    }

    static void printFibonacci(BigInteger n1, BigInteger n2, int remainingTerms) {
        if (remainingTerms > 0) {
            BigInteger n3 = n1.add(n2);
            System.out.print(" " + n3);
            printFibonacci(n2, n3, remainingTerms - 1);
        }
    }
}
