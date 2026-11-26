// Question 11: Print the first n natural numbers and their sum.

import java.util.Scanner;

public class Question11NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int terms = input.nextInt();

        long sum = 0;

        System.out.println("The first " + terms + " natural numbers are:");
        for (int number = 1; number <= terms; number++) {
            System.out.println(number);
            sum += number; // Add the current number to the running total.
        }

        System.out.println("The sum is: " + sum);
    }
}