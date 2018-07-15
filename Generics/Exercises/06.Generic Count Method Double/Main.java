package generic_exercises.generic_count_method_double_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        GenericBox<Double>value=new GenericBox<>();
        int number = Integer.parseInt(reader.readLine());
        int index = 0;
        while (index <number) {
            value.add(Double.parseDouble(reader.readLine()));

            index++;
        }
        double compare=Double.parseDouble(reader.readLine());
        System.out.println(value.equalNumber(compare));
    }
}