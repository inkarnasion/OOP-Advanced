package iteratorAndcomparator_exercises.collection_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String firstInput = reader.readLine();
        firstInput = (firstInput.length() >= 7) ? firstInput.substring(7, firstInput.length()) : "";
        String[] token = firstInput.split("\\s+");
        ListyIterator listyIterator = new ListyIterator(token);

        while (true) {
            String secondInput = reader.readLine();
            if (secondInput.equals("END")) {
                break;
            }
            String[] commandArgs = secondInput.split("\\s+");
            switch (commandArgs[0]) {
                case "HasNext":
                    if (listyIterator.hasNext()) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "PrintAll":
                    listyIterator.PrintAll();
                    break;
            }
        }
    }
}