public enum AirportCode {
    EDI("Edinburgh"),
    LHR("London Heathrow"),
    LAX("Los Angeles");


    private final String name;

    AirportCode(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
