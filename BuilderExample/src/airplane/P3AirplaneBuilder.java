package airplane;

public class P3AirplaneBuilder extends AirplaneBuilder {
    public void setName() {
        airplane.setName("Lockheed P-3");
    }
    public void addTail() {
        airplane.setTailType(TailType.T_TAIL);
    }
    public void addWings() {
        airplane.setWingShape(WingShape.STRAIGHT);
        airplane.setWingConfig(WingConfig.LOW_WING);
    }
    public void addEngines() {
        airplane.setEngine(EngineType.TURBOPROP, 1, 2, 3, 4);
    }

    public void addSystems() {
        airplane.setCrewSize(11);
        airplane.setPassengerSize(0);
    }



}
