// Question 24: Print a right-aligned triangle of @ symbols.

import java.util.Scanner;

public class Question24AtSymbolTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int rows = input.nextInt();

        for (int row = 1; row <= rows; row++) {
            // Leave one leading space on the final row to match the sample.
            for (int space = 1; space <= rows - row + 1; space++) {
                System.out.print(" ");
            }

            for (int symbol = 1; symbol <= row; symbol++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}