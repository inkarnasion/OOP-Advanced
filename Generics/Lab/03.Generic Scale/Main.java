package generics_Lab.generic_scale_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Scale<String> scale = new Scale<>("Ivan", "Veronika");
        System.out.println(scale.getHeavier());
    }
}