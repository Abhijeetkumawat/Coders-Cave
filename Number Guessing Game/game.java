import java.util.Random;
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int minnumber = 1;
        int maxnumber = 100;

        // Generate a random number between 1 and 100
        int randomNumber = generateRandomNumber(minnumber, maxnumber);

        int attempts = 0;
        boolean GuessedCorrectly = false;

        System.out.println("Number Guessing Game");
        System.out.println("I have selected a number between " + minnumber + " and " + maxnumber + ". Try to guess it!");

        while (!GuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < minnumber || userGuess > maxnumber) {
                System.out.println("Please enter a number between " + minnumber + " and " + maxnumber + ".");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                GuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        }

        // Play again or exit?
        System.out.println("Press 1 to play again.");
        System.out.println("Press 0 to exit.");
        int choice = scanner.nextInt();

        if (choice == 1) {
            playGame();
        } else {
            scanner.close();
        }
    }

            static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
