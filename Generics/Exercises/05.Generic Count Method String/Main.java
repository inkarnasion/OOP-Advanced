package generic_exercises.generic_count_method_string_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        GenericBox<String>value=new GenericBox<>();
        int number = Integer.parseInt(reader.readLine());
        int index = 0;
        while (index <number) {
            value.add(reader.readLine());

            index++;
        }
        String compare=reader.readLine();
        System.out.println(value.equalNumber(compare));
    }
}
