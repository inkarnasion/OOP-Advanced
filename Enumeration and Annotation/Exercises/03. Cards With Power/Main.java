package enumeration_and_anotation_exercises.cardsWithPower;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rankNames=reader.readLine();
        String suitNames=reader.readLine();


        RankPowers ranks = RankPowers.valueOf(rankNames);
        SuitPowers suits = SuitPowers.valueOf(suitNames);


        int powersTotal =ranks.getPower() + suits.getPower();

        System.out.println("Card name: "+ranks+" of "+suits+"; Card power: "+powersTotal);
    }
}