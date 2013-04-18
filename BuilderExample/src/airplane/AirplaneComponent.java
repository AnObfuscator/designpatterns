package airplane;

public interface AirplaneComponent {
}

enum WingConfig implements AirplaneComponent {
    LOW_WING, MID_WING, HIGH_WING, PARASOL
}

enum WingShape implements AirplaneComponent {
    SWEPT, DELTA, STRAIGHT
}


enum TailType implements AirplaneComponent {
    STANDARD, TWIN, T_TAIL, V_TAIL
}

enum EngineType implements AirplaneComponent {
    RADIAL_PISTON, V_PISTON, BOXER_PISTON, TURBOJET, TURBOFAN, TURBOPROP
}



