package FifthClass;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;

            while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

       System.out.println("The Greatest Common Divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
