package iteratorAndcomparator_exercises.strategy_pattern_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int count = Integer.parseInt(reader.readLine());

        Set<Person> nameSet = new TreeSet<>(new PersonNameComparator());
        Set<Person> ageSet = new TreeSet<>(new PersonAgeComparator());

        int i = 0;
        while (i < count) {
            String[] personArgs = reader.readLine().split("\\s+");
            Person person = new Person(personArgs[0], Integer.parseInt(personArgs[1]));
            nameSet.add(person);
            ageSet.add(person);
            i++;
        }

        for (Person person : nameSet) {
            System.out.println(person);
        }
        for (Person person : ageSet) {
            System.out.println(person);
        }
    }
}