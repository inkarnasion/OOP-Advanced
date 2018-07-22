package enumeration_and_anotation_exercises.customEnumAnnotations;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String input = reader.readLine();
        Class<?>cardClass= null;
        if(input.equals("Rank")){
            Annotation annotation = RankPowers.class.getAnnotation(Annotation.class);
            System.out.printf("Type = %s, Description = %s", annotation.type(), annotation.description());
        }else if(input.equals("Suit")){
            Annotation annotation = SuitPowers.class.getAnnotation(Annotation.class);
            System.out.printf("Type = %s, Description = %s", annotation.type(), annotation.description());
        }
    }
}