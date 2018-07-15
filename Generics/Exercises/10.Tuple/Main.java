package generic_exercises.tuple_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] firstInput = reader.readLine().split("\\s+");
        String[] secondInput = reader.readLine().split("\\s+");
        String[] thirdInput = reader.readLine().split("\\s+");

        Tuple<String, String> firstTuple = new Tuple<>(firstInput[0] + " " + firstInput[1], firstInput[2]);
        Tuple<String, Integer> secondTuple = new Tuple<>(secondInput[0], Integer.valueOf(secondInput[1]));
        Tuple<Integer, Double>thirdTuple = new Tuple<>(Integer.valueOf(thirdInput[0]), Double.valueOf(thirdInput[1]));

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);
    }
}
