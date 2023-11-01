import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
    public static int newCard()
    {
        Random generator = new Random();
        int newCard;
        return newCard = generator.nextInt(0, 12);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int dealerTotal;
        int playerTotal;

        int dealerFirstCard = newCard();
        int dealerSecondCard = newCard();

        int playerFirstCard = newCard();
        int playerSecondCard = newCard();

        dealerTotal = dealerFirstCard + dealerSecondCard;
        playerTotal = playerFirstCard + playerSecondCard;

        System.out.print("Welcome to the Blackjack table! Please place your bet (Minimum bet $5): $");
        int bet = input.nextInt();

        // Display dealers first card face down and players two cards face up.
        System.out.println("Dealers Hand: " + dealerFirstCard);
        System.out.println("Players Hand: " + playerFirstCard + playerSecondCard);


        if (dealerTotal == 21 && playerTotal != 21) System.out.println("The dealer has blackjack. You lose! ");
        dealerTotal = dealerFirstCard + dealerSecondCard;



    }
}
