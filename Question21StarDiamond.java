// Question 21: Print a star diamond.

import java.util.Scanner;

public class Question21StarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows (half of the diamond): ");
        int rows = input.nextInt();

        // Print the upper half, including the widest row.
        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Start one row below the widest so it appears only once.
        for (int row = rows - 1; row >= 1; row--) {
            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}