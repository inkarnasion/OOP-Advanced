package iteratorAndcomparator_exercises.stackIterator_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack stack = new Stack();
        String input;

        while (!"END".equals(input = reader.readLine())) {
            String[] commandArgs = input.split(", | ");
            String commandType = commandArgs[0];

            try {
                if ("Push".equals(commandType)) {
                    stack.push(Stream.of(commandArgs).skip(1).map(Integer::parseInt).toArray(Integer[]::new));

                } else if ("Pop".equals(commandType)) {
                    stack.pop();

                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Iterator iterator = stack.iterator();
             iterator.hasNext(); ) {
            Object object = iterator.next();
            System.out.println(object);
        }
        for (Iterator iterator = stack.iterator();
             iterator.hasNext(); ) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}