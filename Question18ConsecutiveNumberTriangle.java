// Question 18: Count upward across all four rows.

public class Question18ConsecutiveNumberTriangle {
    public static void main(String[] args) {
        int rows = 4;
        int number = 1; // Keep this outside the loops so it does not reset.

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                if (column > 1) {
                    System.out.print(" "); // Separate numbers with spaces.
                }
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}