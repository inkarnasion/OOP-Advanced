package generic_exercises.threeuple_11;

public class Tuple<T> {
    private T firstItem;
    private T secondItem;
    private T thirdItem;

    public Tuple(T firstItem, T secondItem, T thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }

    @Override
    public String toString() {
        return this.firstItem.toString() + " -> " + this.secondItem.toString() + " -> " + this.thirdItem.toString();
    }
}
