import java.util.ArrayList;
import java.util.Arrays;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        ArrayList<String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        ArrayList<String> hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static ArrayList<String> getDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King"};        

        //String[] deck = new String[52];
        ArrayList<String> deck = new ArrayList<>(52);
        //int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
                //i++;
            }
        }
        return deck;
    }

    private static void displayCards(ArrayList<String> deck) {
        System.out.print("|");        
        for (String card : deck) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    private static void shuffleDeck(ArrayList<String> deck) {
        for (String card : deck) {
        	//save the card at position i
            String savedCard = card;
            int randomIndex = (int) (Math.random() * deck.size()-1);
            //sets whatever the random index had to i
            deck.set(randomIndex, card);
            //sets I to a random placement
            //deck[randomIndex] = savedCard;
            deck.set(randomIndex, savedCard);
        }
    }

    private static ArrayList<String> dealCards(ArrayList<String> deck, int count) {
        //basically it pulls the top two cards off of the deck
    	ArrayList<String> hand = new ArrayList<String>(deck.subList(0, count));
        return hand;
    }
}