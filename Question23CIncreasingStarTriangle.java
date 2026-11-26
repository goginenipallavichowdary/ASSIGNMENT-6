// Question 23C: Print an increasing star triangle.

import java.util.Scanner;

public class Question23CIncreasingStarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int rows = input.nextInt();

        for (int row = 1; row <= rows; row++) {
            // The number of stars equals the row number.
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}