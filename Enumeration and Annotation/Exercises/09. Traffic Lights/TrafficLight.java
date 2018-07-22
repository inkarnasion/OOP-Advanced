package enumeration_and_anotation_exercises.traffic_lights;

public class TrafficLight {
    private Signal signal;

    public TrafficLight(Signal signal) {
        this.signal = signal;
    }

    public String update() {

        int currentOrdinal = this.signal.ordinal();
        Signal[] signals = Signal.values();
        this.signal = signals[(currentOrdinal + 1) % 3];
        return signal.name();

    }

    @Override
    public String toString() {
        return this.signal.name();
    }
}