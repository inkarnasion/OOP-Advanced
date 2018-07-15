package iteratorAndcomparator_exercises.stackIterator_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stack<T>  implements Iterable<T>{
   private List<Integer> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(Integer... element) {
        this.data.addAll(Arrays.asList(element));
    }

    public int pop() {
        if (this.data.size() <= 0) {
            throw new IllegalStateException("No elements");
        }
        return this.data.remove(this.data.size() - 1);
    }


    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private final class StackIterator implements Iterator<T> {

        private int counter;

        private StackIterator() {
            this.counter = data.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return this.counter >= 0;
        }

        @Override
        public T next() {
            return (T) data.get(this.counter--);
        }
    }
}
