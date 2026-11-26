// Question 20: Print Floyd's triangle.

import java.util.Scanner;

public class Question20FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = input.nextInt();

        int number = 1; // Continue counting across rows.

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (column > 1) {
                    System.out.print(" ");
                }
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}