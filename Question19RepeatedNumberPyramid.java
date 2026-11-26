// Question 19: Print a pyramid with repeated row numbers.

public class Question19RepeatedNumberPyramid {
    public static void main(String[] args) {
        int rows = 4;

        for (int row = 1; row <= rows; row++) {
            // Print fewer leading spaces as the pyramid gets wider.
            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= row; column++) {
                if (column > 1) {
                    System.out.print(" ");
                }
                System.out.print(row);
            }
            System.out.println();
        }
    }
}