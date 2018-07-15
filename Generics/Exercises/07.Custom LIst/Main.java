package generic_exercises.custom_list_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        CustomList<String> list = new CustomList<>();

        String inputLine = reader.readLine();
        while (!inputLine.equals("END")) {
            String[] tokens = inputLine.split("\\s+");
            String commandArgs = tokens[0];
            if ("Add".equals(commandArgs)) {
                String element = tokens[1];
                list.add(element);

            } else if ("Remove".equals(commandArgs)) {
                int index = Integer.parseInt(tokens[1]);
                list.remove(index);

            } else if ("Contains".equals(commandArgs)) {
                String element;
                element = tokens[1];
                System.out.println(list.contains(element));

            } else if ("Swap".equals(commandArgs)) {
                int firstIndex = Integer.parseInt(tokens[1]);
                int secondIndex = Integer.parseInt(tokens[2]);
                list.swap(firstIndex, secondIndex);

            } else if ("Greater".equals(commandArgs)) {
                String element;
                element = tokens[1];
                System.out.println(list.getGreaterElements(element));

            } else if ("Max".equals(commandArgs)) {
                System.out.println(list.getMax());

            } else if ("Min".equals(commandArgs)) {
                System.out.println(list.getMin());

            } else if ("Print".equals(commandArgs)) {
                System.out.println(list);

            }
            inputLine = reader.readLine();
        }
    }
}