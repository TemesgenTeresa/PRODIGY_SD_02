import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the number of attempts
        int numberOfAttempts = 0;
        int userGuess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the user guesses the correct number
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
