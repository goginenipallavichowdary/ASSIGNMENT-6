// Question 22: Print Pascal's triangle.

import java.util.Scanner;

public class Question22PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = input.nextInt();

        long[] previousRow = new long[rows];

        for (int row = 0; row < rows; row++) {
            long[] currentRow = new long[rows];

            for (int space = 0; space < rows - row - 1; space++) {
                System.out.print(" ");
            }

            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    currentRow[column] = 1; // Both ends of a row are 1.
                } else {
                    // Add the two numbers above this position.
                    currentRow[column] = previousRow[column - 1] + previousRow[column];
                }

                if (column > 0) {
                    System.out.print(" ");
                }
                System.out.print(currentRow[column]);
            }
            System.out.println();

            previousRow = currentRow; // Use this row to build the next one.
        }
    }
}