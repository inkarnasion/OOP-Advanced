package iteratorAndcomparator_exercises.comparing_object_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Person> persons = new ArrayList<>();
        String command;

        while (!"END".equals(command = reader.readLine())) {
            String[] commandArgs = command.split("\\s+");
            Person person = new Person(commandArgs[0], Integer.parseInt(commandArgs[1]), commandArgs[2]);
            persons.add(person);
        }
        int index = Integer.parseInt(reader.readLine());
        if (index >= persons.size()) {
            System.out.println("No matches");
            return;
        }
        Person person = persons.get(index);
        long count = 0L;
        for (Person p : persons) {
            if (p.compareTo(person) == 0) {
                count++;
            }
        }
        int equal = Math.toIntExact(count);

        if (equal == 0) {
            System.out.println("No matches");
            return;
        }

        System.out.println(String.format("%d %d %d", equal, persons.size() - equal, persons.size()));
    }
}