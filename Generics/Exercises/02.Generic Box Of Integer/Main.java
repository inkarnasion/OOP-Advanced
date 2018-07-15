package generic_exercises.generic_box_of_integer_02;

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
        System.out.println(value);
    }
}