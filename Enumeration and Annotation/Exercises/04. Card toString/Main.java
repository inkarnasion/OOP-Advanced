package enumeration_and_anotation_exercises.cardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String rank = reader.readLine();
        String suit = reader.readLine();
        Card card = new Card(rank, suit);
        System.out.println(card);
    }
}