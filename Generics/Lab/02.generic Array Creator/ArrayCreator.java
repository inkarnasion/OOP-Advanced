package generics_Lab.generic_array_creator_02;

import java.lang.reflect.Array;

public class ArrayCreator<T> {
    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {

        T[] arr = (T[]) new Object[length];

        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }

        return arr;
    }


    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> tClass, int length, T item) {

        T[] arr = (T[]) Array.newInstance(tClass, length);

        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }

        return arr;
    }
}
