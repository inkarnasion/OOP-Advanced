package generics_Lab.null_finder_05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 1,2, null, 21, 12, null);

        System.out.println(ListUtils.getNullIndices(ints));
    }
}