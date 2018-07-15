package generic_exercises.generic_box_01;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
   private List<T> value;

    public GenericBox() {
        this.value = new ArrayList<>();
    }

    public void add(T item) {
        this.value.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<T> boxes1 = this.value;
        for (int i = 0, boxes1Size = boxes1.size(); i < boxes1Size; i++) {
            T item = boxes1.get(i);
            sb.append(item.getClass().getCanonicalName())
                    .append(": ")
                    .append(item)
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
