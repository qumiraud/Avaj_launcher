import aircraftpackage.*;

public final class AircraftFactory {

	private static volatile AircraftFactory instance;
	private static long						id = 1;
	
	private AircraftFactory(){ };

	public static AircraftFactory getInstance() {
		AircraftFactory result = instance;
		if (result != null)
			return result;
		synchronized(AircraftFactory.class){
			if (instance == null)
				instance = new AircraftFactory();
		}
		return instance;
	};

	//@CheckReturnValue à configurer avec un builder type maven ou graddle;
	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates)
	{
		return switch (p_type) {
			case "Helicopter"	-> new Helicopter(id++, p_name, p_coordinates);
			case "JetPlane"		-> new JetPlane(id++, p_name, p_coordinates);
			case "Balloon"		-> new Balloon(id++, p_name, p_coordinates);
			default				-> null;
		};
	};
}
