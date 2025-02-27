import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(scanner.nextLine());

                // Validate non-negative input
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                } else {
                    break; // Valid input, exit loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        scanner.close();
        return number;
    }

    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply each number from 1 to n
        }
        return factorial;
    }

    // Main method
    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // Get user input
        long factorial = calculateFactorial(number); // Compute factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}