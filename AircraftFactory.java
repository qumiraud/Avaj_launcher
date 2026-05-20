import aircraftpackage.*;

public final class AircraftFactory {

	private static volatile AircraftFactory instance;
	
	private AircraftFactory(){
		System.out.println("An AircraftFactory has been created");
	};

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
		switch (p_type) {
			case "Helicopter":
				return new Helicopter(0, p_name, p_coordinates);
			case "JetPlane":
				return new JetPlane(0, p_name, p_coordinates);
			case "Balloon":
				return new Balloon(0, p_name, p_coordinates);
			default:
				return null;
		}
	};
}
