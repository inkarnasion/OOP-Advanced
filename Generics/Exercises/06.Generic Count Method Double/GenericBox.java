package generic_exercises.generic_count_method_double_06;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {

    private List<T> elements;

    public GenericBox(){
        this.elements=new ArrayList<>();
    }
    public void add(T element){
        this.elements.add(element);
    }

    public <T extends Comparable<T>>Integer equalNumber(T comparableItem){
        return (int) this.elements
                .stream()
                .map(element -> (T) element)
                .filter(element -> comparableItem.compareTo(element) < 0).count();
    }
}
