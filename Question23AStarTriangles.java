// Question 23A: Print a growing and a shrinking star triangle.

public class Question23AStarTriangles {
    public static void main(String[] args) {
        int rows = 5;

        for (int row = 1; row <= rows; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println("..............................");

        // Count backward so each row has one fewer star.
        for (int row = rows; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}