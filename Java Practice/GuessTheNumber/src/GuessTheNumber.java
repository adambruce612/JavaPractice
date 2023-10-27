import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Have the computer generate a random number
        int correctNumber = rand.nextInt(0, 101);

        System.out.println("Guess the number between 1 and 100!");

        // Get the number from the user
        System.out.print("Enter in your guess: ");
        int guess = input.nextInt();

        while (guess != correctNumber)
        {
            if (guess < correctNumber) System.out.println("Your guess is too low. Please guess again.");
            else System.out.println("Your guess is too high. Please guess again.");

            System.out.print("Enter in your guess: ");
            guess = input.nextInt();
        }
        
        System.out.println("Congrats! The correct number was " + correctNumber + " You guessed the number!");
    }
}
