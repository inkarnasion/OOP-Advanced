package generics_Lab.list_utilities_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
    }
}