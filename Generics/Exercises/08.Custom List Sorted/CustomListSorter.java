package generic_exercises.custom_list_sorted_08;

public class CustomListSorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> lists) {
        lists.sort();
    }
}