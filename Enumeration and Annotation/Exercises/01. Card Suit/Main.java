package enumeration_and_anotation_exercises.cardSuit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Card Suits:");

        for (CardSuits cardSuits : CardSuits.values()) {
            System.out.println("Ordinal value: " + cardSuits.ordinal() + "; Name value: " + cardSuits.name());
        }
    }
}