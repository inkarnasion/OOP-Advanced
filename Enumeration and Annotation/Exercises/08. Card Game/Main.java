package enumeration_and_anotation_exercises.cardGame;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String firstPlayer = reader.readLine();
        String secondPlayer = reader.readLine();
        Map<String, Card> playngCards = new HashMap<>();
        boolean firstPlayerWins = false;
        Card bestCard = null;
        while (true) {
            if (playngCards.size() >= 10) break;
            String cardName = reader.readLine();
            try {
                String[] rankAndSuit = cardName.split("\\s+of\\s+");
                RankPowers rankPowers = RankPowers.valueOf(rankAndSuit[0]);
                SuitPowers suitPowers = SuitPowers.valueOf(rankAndSuit[1]);
                if (!playngCards.containsKey(cardName)) {
                    Card card = new Card(rankPowers, suitPowers);
                    int power = card.getPowers();
                    if (bestCard == null) {
                        bestCard = card;
                        firstPlayerWins = playngCards.size() <= 5;
                    } else if (power > bestCard.getPowers()) {
                        bestCard = card;
                        firstPlayerWins = playngCards.size() <= 5;
                    }
                    playngCards.put(card.toString(), card);
                } else {
                    System.out.println("Card is not in the deck.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("No such card exists.");
            }
        }
        String end = String.format(" wins with %s.", bestCard);
        String output;
        if (firstPlayerWins) {
            output = firstPlayer + end;
        }
        else{
            output = secondPlayer + end;
        }
        System.out.println(output);
    }
}
