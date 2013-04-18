package airplane;

import java.util.HashMap;
import java.util.Map;

public class Airplane {

    private String name;
    private Map<Integer, EngineType> engineMap;
    private TailType tail;
    private WingConfig wingConfig;
    private WingShape wingShape;
    private long crewSize;
    private long passengerSize;


    protected Airplane() {
        engineMap = new HashMap<Integer, EngineType>();
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setEngine(EngineType engine, Integer... engineNumbers) {

        for (Integer engineNumber : engineNumbers)
            engineMap.put(engineNumber, engine);
    }

    protected void setTailType(TailType tail) {
        this.tail = tail;
    }

    protected void setWingConfig(WingConfig config) {
        this.wingConfig = config;
    }

    protected void setWingShape(WingShape shape) {
        this.wingShape = shape;
    }

    protected void setCrewSize(long crewSize) {
        this.crewSize = crewSize;
    }

    protected void setPassengerSize(long passengerSize) {
        this.passengerSize = passengerSize;
    }

    public String toString() {
        String airplaneString = "\n"+name;
        airplaneString += "\n"+"Tail type: "+tail;
        airplaneString += "\n"+"Wing Config: "+wingConfig;
        airplaneString += "\n"+"Wing Shape: "+wingShape;
        airplaneString += "\n"+"Crew: "+crewSize;
        airplaneString += "\n"+"Passengers: "+passengerSize;

        for(Integer engineNumber : engineMap.keySet())
            airplaneString += "\n"+"Engine "+engineNumber+" type: "+engineMap.get(engineNumber);

        return airplaneString;
    }

}
