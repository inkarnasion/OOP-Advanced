package generic_exercises.custom_list_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable<T>> {
    List<T> lists;

    public CustomList() {
        this.lists = new ArrayList<>();
    }

    public void add(T item) {
        this.lists.add(item);
    }

    public T remove(int index) {
        return this.lists.remove(index);
    }

    public boolean contains(T element) {
        return this.lists.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T temp = this.lists.get(firstIndex);
        this.lists.set(firstIndex, this.lists.get(secondIndex));
        this.lists.set(secondIndex, temp);
    }

    public int getGreaterElements(T element) {
        int count = 0;
        for (Iterator<T> iterator = this.lists.iterator();
             iterator.hasNext(); ) {
            T item = iterator.next();
            if (item.compareTo(element) > 0) count++;
        }
        return count;
    }

    public T getMax() {
        return Collections.max(this.lists);
    }

    public T getMin() {
        return Collections.min(this.lists);
    }

    @Override
    public String toString() {
        String sb = this.lists
                .stream()
                .map(item -> item + System.lineSeparator())
                .collect(Collectors.joining());
        return sb.trim();
    }
}