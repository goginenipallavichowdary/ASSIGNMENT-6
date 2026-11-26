// Question 26: Print a rhombus made of letters.

import java.util.Scanner;

public class Question26CharacterRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int size = input.nextInt();

        if (size < 1 || size > 26) {
            System.out.println("Please enter a number from 1 to 26.");
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

            // Adding an index to 'A' gives A, B, C, and so on.
            for (int index = 0; index < row; index++) {
                System.out.print((char) ('A' + index));
            }

            int reverseStart = row - 2;
            if (line == size && size > 1) {
                reverseStart = row - 1; // Repeat the middle letter as shown.
            }

            for (int index = reverseStart; index >= 0; index--) {
                System.out.print((char) ('A' + index));
            }
            System.out.println();
        }
    }
}