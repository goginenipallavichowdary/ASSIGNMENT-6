// Question 13: Print each number and its cube.

import java.util.Scanner;

public class Question13DisplayCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int terms = input.nextInt();

        for (long number = 1; number <= terms; number++) {
            long cube = number * number * number; // Multiply it by itself twice.
            System.out.println("Number is: " + number + " and cube of "
                    + number + " is: " + cube);
        }
    }
}