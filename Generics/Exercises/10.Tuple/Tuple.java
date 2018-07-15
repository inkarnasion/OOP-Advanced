package generic_exercises.tuple_10;

public class Tuple<T, E> {
    private T firstItem;
    private E secondItem;

    public Tuple(T firstItem, E secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return this.firstItem;
    }

    public E getSecondItem() {
        return this.secondItem;
    }

    @Override
    public String toString() {
        return this.firstItem.toString() + " -> " + this.secondItem.toString();
    }
}