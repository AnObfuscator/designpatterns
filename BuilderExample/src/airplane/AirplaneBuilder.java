package airplane;

public abstract class AirplaneBuilder {

    protected Airplane airplane;

    public AirplaneBuilder() {
        this.airplane = new Airplane();
    }

    public void setName() {}
    public void addTail() {}
    public void addWings() {}
    public void addEngines() {}
    public void addSystems() {}

    public boolean validateAirplane() {
        return true;
    }

    public Airplane getAirplane() {
        return airplane;
    }

}
