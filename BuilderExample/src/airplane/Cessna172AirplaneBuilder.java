package airplane;

public class Cessna172AirplaneBuilder extends AirplaneBuilder {

    public void setName() {
        airplane.setName("Cessna 172");
    }

    public void addTail() {
        airplane.setTailType(TailType.STANDARD);
    }

    public void addWings() {
        airplane.setWingConfig(WingConfig.HIGH_WING);
        airplane.setWingShape(WingShape.STRAIGHT);
    }

    public void addEngines() {
        airplane.setEngine(EngineType.BOXER_PISTON, 1);
    }

    public void addSystems() {
        airplane.setCrewSize(2);
        airplane.setPassengerSize(2);
    }
}
