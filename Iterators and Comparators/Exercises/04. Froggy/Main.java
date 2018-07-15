package iteratorAndcomparator_exercises.froggy_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers =
                new ArrayList<>();
        for (String s1 : reader.readLine().split(" |, ")) {
            Integer parseInt = Integer.parseInt(s1);
            numbers.add(parseInt);
        }

        Lake<Integer> lake = new Lake<>(numbers);

        List<Integer> result = new ArrayList<>();
        lake.forEach(result::add);

        StringJoiner joiner = new StringJoiner(", ");
        for (Integer integer : result) {
            String s = String.valueOf(integer);
            joiner.add(s);
        }
        System.out.println(joiner.toString());
    }
}