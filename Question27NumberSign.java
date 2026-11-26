// Question 27: Check whether an integer is negative, zero, or positive.

import java.util.Scanner;

public class Question27NumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            // Any remaining integer must be greater than zero.
            System.out.println("Number is positive");
        }
    }
}