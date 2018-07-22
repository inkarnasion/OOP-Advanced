package enumeration_and_anotation_exercises.cardRank;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Card Ranks: ");
        for (CardRank rank : CardRank.values()) {

            System.out.println("Ordinal value: " + rank.ordinal() + "; Name value: " + rank.name());
        }
    }
}
