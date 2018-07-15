package generic_exercises.generic_swap_method_string_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericBox<T> {
   private List<T> value;

    public GenericBox() {
        this.value = new ArrayList<>();
    }

    public void add(T item) {
        this.value.add(item);
    }

    public void swapElements(int firstIndex, int secondIndex) {
        T temp = this.value.get(firstIndex);
        this.value.set(firstIndex, this.value.get(secondIndex));
        this.value.set(secondIndex, temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Iterator<T> iterator = this.value.iterator();
             iterator.hasNext(); ) {
            T item = iterator.next();
            sb.append(item.getClass().getCanonicalName())
                    .append(": ")
                    .append(item)
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}