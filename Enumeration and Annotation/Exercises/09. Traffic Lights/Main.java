package enumeration_and_anotation_exercises.traffic_lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] signals = reader.readLine().split("\\s+");
        List<TrafficLight> lights = Arrays.stream(signals)
                .map(signal -> new TrafficLight(Signal.valueOf(signal)))
                .collect(Collectors.toList());

        int newLights = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, newLights).forEachOrdered(i -> {
            for (Iterator<TrafficLight> iterator = lights.iterator();
                 iterator.hasNext(); ) {
                TrafficLight light = iterator.next();
                sb.append(light.update()).append(" ");
            }
            sb.append(System.lineSeparator());
        });

        System.out.println(sb.toString().trim());
    }
}