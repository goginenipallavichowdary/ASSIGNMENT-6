// Question 10: Display the first 10 natural numbers.

public class Question10NaturalNumbers {
    public static void main(String[] args) { // Java starts running here.
        System.out.println("The first 10 natural numbers are:");
        System.out.println(); // Print a blank line.

        // Start at 1, keep going through 10, and add 1 after each turn.
        for (int number = 1; number <= 10; number++) {
            System.out.println(number); // Print each number on its own line.
        }
    }
}