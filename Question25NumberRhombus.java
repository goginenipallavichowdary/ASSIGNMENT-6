// Question 25: Print a rhombus made of numbers.

import java.util.Scanner;

public class Question25NumberRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int size = input.nextInt();

        // Use 1 to 9 so each printed number takes one character.
        if (size < 1 || size > 9) {
            System.out.println("Please enter a number from 1 to 9.");
            return;
        }

        for (int line = 1; line <= 2 * size - 1; line++) {
            int row = line;
            if (line > size) {
                row = 2 * size - line; // Count down after the middle.
            }

            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            for (int number = row; number >= 1; number--) {
                System.out.print(number);
            }

            // Start at 2 so the center 1 is printed only once.
            for (int number = 2; number <= row; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}