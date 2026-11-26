// Question 23B: Print a decreasing star triangle.

import java.util.Scanner;

public class Question23BDecreasingStarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int rows = input.nextInt();

        for (int row = 0; row < rows; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" "); // Indent each row a little more.
            }

            for (int star = 0; star < rows - row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}