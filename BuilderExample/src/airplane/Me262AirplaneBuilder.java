package airplane;

public class Me262AirplaneBuilder extends AirplaneBuilder {
    public void setName() {
        airplane.setName("Me. 262");
    }
    public void addTail() {
        airplane.setTailType(TailType.T_TAIL);
    }
    public void addWings() {
        airplane.setWingConfig(WingConfig.LOW_WING);
        airplane.setWingShape(WingShape.SWEPT);
    }
    public void addEngines() {
        airplane.setEngine(EngineType.TURBOJET, 1, 2);
    }
    public void addSystems() {
        airplane.setCrewSize(1);
        airplane.setPassengerSize(0);
    }
}
