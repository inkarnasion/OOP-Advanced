package generic_exercises.generic_swap_method_integer_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        GenericBox<Integer> value = new GenericBox<>();
        int number = Integer.parseInt(reader.readLine());
        int index = 0;
        while (index < number) {
            value.add(Integer.parseInt(reader.readLine()));
            index++;
        }
        String[] tokens = reader.readLine().split("\\s+");
        int firstIndex = Integer.parseInt(tokens[0]);
        int secondIndex = Integer.parseInt(tokens[1]);
        value.swapElements(firstIndex, secondIndex);
        System.out.println(value);
    }
}