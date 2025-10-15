
package chapter1_challenge_1_2;

/**
 *
 /**
 * Chapter1_Challenge_1_2: The Lottery Number Analyzer
 * 
 * Analyzes lottery numbers by:
 * - Removing dashes from each ticket string
 * - Converting to individual digit integers
 * - Calculating sum and average of digits
 * - Identifying the ticket with the highest digit average
 * 
 * Uses both for loop (indexed) and for-each loop as required.
 */
public class Chapter1_Challenge_1_2 {

    public static void main(String[] args) {
        String[] winningNumbers = {
            "12-34-56-78-90",
            "33-44-11-66-22",
            "01-02-03-04-05"
        };

        // Variables to track the best ticket
        int bestIndex = 0;
        double highestAverage = -1.0;

        // Use a traditional for loop (indexed) to iterate over tickets
        for (int i = 0; i < winningNumbers.length; i++) {
            String ticket = winningNumbers[i];
            System.out.println("Analyzing: " + ticket);

            // Remove dashes
            String cleaned = ticket.replace("-", "");

            // Prepare to calculate sum
            int sum = 0;

            // Convert to char array and use for-each loop
            char[] digits = cleaned.toCharArray();
            for (char c : digits) {
                sum += Character.getNumericValue(c);
            }

            // Calculate average (10 digits per ticket)
            double average = sum / 10.0;

            // Print analysis
            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);

            // Track highest average
            if (average > highestAverage) {
                highestAverage = average;
                bestIndex = i;
            }
        }

        // Announce winner
        System.out.println("The winning number with the highest average is: " 
            + winningNumbers[bestIndex] + " with an average of " + highestAverage);
    }
}