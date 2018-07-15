package generic_exercises.custom_list_sorted_08;


import java.util.*;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable<T>> {
   private List<T> lists;

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
        for (Iterator<T> iterator = this.lists.iterator();
             iterator.hasNext(); ) {
            T item = iterator.next();
            if (item.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
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
    public void sort() {
        Collections.sort(this.lists);
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