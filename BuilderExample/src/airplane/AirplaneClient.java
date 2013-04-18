package airplane;

public class AirplaneClient {

    public static void main(String[] args) {

        AirplaneBuilder builder;
        AirplaneDirector director;
        Airplane airplane;


        builder = new Cessna172AirplaneBuilder();
        director = new AirplaneDirector(builder);
        director.construct();
        airplane = builder.getAirplane();
        System.out.println(airplane.toString());


        builder = new Me262AirplaneBuilder();
        director = new AirplaneDirector(builder);
        director.construct();
        airplane = builder.getAirplane();
        System.out.println(airplane.toString());


        builder = new P3AirplaneBuilder();
        director = new AirplaneDirector(builder);
        director.construct();
        airplane = builder.getAirplane();
        System.out.println(airplane.toString());

    }
}
