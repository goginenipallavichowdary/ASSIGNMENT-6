// Question 16: Start each row at 1 and count up to the row number.

import java.util.Scanner;

public class Question16NumberTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = input.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number); // Stay on the same line.
            }
            System.out.println(); // Start a new line after the row.
        }
    }
}