package enumeration_and_anotation_exercises.deckOfCards;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (SuitPowers suitPowers : SuitPowers.values()) {
            for (RankPowers rankPowers : RankPowers.values()) {
                System.out.println(rankPowers+ " of "+suitPowers);
            }
        }
    }
}
