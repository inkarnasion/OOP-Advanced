package iteratorAndcomparator_exercises.listIterator_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        ListyIterator<String>listyIterator=null;

        while (! "END".equals(line=reader.readLine())){
            String [] cmdArgs=line.split("\\s+");
            switch (cmdArgs[0]){
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                   listyIterator.print();
                    break;
                case "Create":
                    listyIterator= new ListyIterator<String>(Arrays.stream(cmdArgs)
                    .skip(1).toArray(String[]::new));


            }
        }
    }
}
