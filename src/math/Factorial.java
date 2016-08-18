package math;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int num) {

        if (num > 1) {
            return num * factorial(num - 1);
        } else
            return num;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, fact = 1;
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("DENIED! number must be positive.");
            System.exit(0);

        }
        System.out.println("The factorial calculated using recursion is: " + factorial(num));
        for (int i = num; i > 1; i--) {
            fact = fact + 1;
        }
        System.out.println("Factorial using iteration: " + fact);
    }

}