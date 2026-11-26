// Question 12: Find the sum and average of five numbers.

import java.util.Scanner;

public class Question12SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;

        System.out.println("Input the 5 numbers:");
        for (int count = 1; count <= 5; count++) {
            int number = input.nextInt();
            sum += number; // Add each input to the total.
        }

        double average = sum / 5.0; // Use 5.0 to keep the decimal part.

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);
    }
}