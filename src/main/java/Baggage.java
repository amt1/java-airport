public class Baggage {
    private String name;
    private BaggageType transportationType;

    public Baggage(String name, BaggageType transportationType) {
        this.name = name;
        this.transportationType = transportationType;
    }

    public String getName() {
        return name;
    }

    public BaggageType getTransportationType() {
        return this.transportationType;
    }
}
