package generic_exercises.generic_box_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        GenericBox<String> value = new GenericBox<>();
        int numbers = Integer.parseInt(reader.readLine());
        int index = 0;
        while (index < numbers) {
            value.add(reader.readLine());
            index++;
        }
        System.out.println(value);
    }
}