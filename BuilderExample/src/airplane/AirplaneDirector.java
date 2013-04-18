package airplane;

public class AirplaneDirector {
    private AirplaneBuilder builder;

    public AirplaneDirector(AirplaneBuilder builder) {
        this.builder = builder;
    }

    public boolean construct() {
        builder.setName();
        builder.addWings();
        builder.addTail();
        builder.addEngines();
        builder.addSystems();
        return builder.validateAirplane();
    }

}
