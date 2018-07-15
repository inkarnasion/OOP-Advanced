package generics_Lab.generic_array_creator_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Object[] strings = ArrayCreator.create(10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 5, 1);
        System.out.println(integers.length);
    }
}
