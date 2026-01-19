
package coreprogramming.strings.level3;
import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[index++] = ranks[i] + " of " + suits[j];
            }
        }

        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCard = i + (int) (Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        int totalCardsNeeded = numPlayers * cardsPerPlayer;

        // Validate if distribution is possible
        if (totalCardsNeeded > deck.length) {
            System.out.println("Error: Not enough cards in the deck!");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    public static void printPlayers(String[][] players) {
        if (players == null) {
            return;
        }

        System.out.println("\n=== Card Distribution ===");
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + (j + 1) + ". " + players[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace" };

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);
        System.out.println("Total cards in deck: " + deck.length);

        // Shuffle deck
        shuffleDeck(deck);
        System.out.println("Deck shuffled!");

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number of players: ");
        int numPlayers = input.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = input.nextInt();

        // Distribute cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print results
        printPlayers(players);

        input.close();
    }
}
