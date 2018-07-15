package iteratorAndcomparator_exercises.strategy_pattern_06;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}