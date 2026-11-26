// Question 17: Repeat the row number across each row.

public class Question17RepeatedNumberTriangle {
    public static void main(String[] args) {
        int rows = 4; // The worksheet shows four rows.

        for (int row = 1; row <= rows; row++) {
            for (int count = 1; count <= row; count++) {
                System.out.print(row); // Print the row number every time.
            }
            System.out.println();
        }
    }
}