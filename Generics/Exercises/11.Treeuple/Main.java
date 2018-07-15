package generic_exercises.threeuple_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = reader.readLine().split("\\s+");
        String[] secondInput = reader.readLine().split("\\s+");
        String[] thirdInput = reader.readLine().split("\\s+");

        Tuple firstTuple = new Tuple<>(firstInput[0] + " " + firstInput[1], firstInput[2], firstInput[3]);
        Tuple secondTuple = new Tuple<>(secondInput[0], Integer.valueOf(secondInput[1]), secondInput[2].equals("drunk"));
        Tuple thirdTuple = new Tuple<>((thirdInput[0]), Double.valueOf(thirdInput[1]), thirdInput[2]);

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);
    }
}

