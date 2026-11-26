// Question 15: Print the first n odd numbers and their sum.

import java.util.Scanner;

public class Question15SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        long oddNumber = 1;
        long sum = 0;

        System.out.println("The odd numbers are:");
        for (int count = 1; count <= terms; count++) {
            System.out.println(oddNumber);
            sum += oddNumber;
            oddNumber += 2; // Move to the next odd number.
        }

        System.out.println("The sum of the first " + terms
                + " odd numbers is: " + sum);
    }
}