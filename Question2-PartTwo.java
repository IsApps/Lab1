// This program checks if a test score is Excellent, Pass, or Fail
import java.util.Scanner; // Import Scanner to take user input

public class TestResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        // Ask user for their test score
        System.out.print("Enter your test score: ");
        int score = input.nextInt(); // Read score as an integer

        // Check the score range and print the result
        if (score >= 80) {
            System.out.println("Excellent");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        input.close(); // Close the Scanner
    }
}
