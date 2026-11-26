// Question 14: Print a multiplication table starting at zero.

import java.util.Scanner;

public class Question14MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number for the table: ");
        int number = input.nextInt();

        System.out.print("Input the last multiplier: ");
        int lastMultiplier = input.nextInt();

        // Include both zero and the last multiplier, as in the worksheet.
        for (int multiplier = 0; multiplier <= lastMultiplier; multiplier++) {
            long product = (long) number * multiplier;
            System.out.println(number + " X " + multiplier + " = " + product);
        }
    }
}