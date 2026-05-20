import aircraftpackage.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Starting project");
		AircraftFactory flyFactory = AircraftFactory.getInstance();
		System.out.println(flyFactory);

		flyFactory.newAircraft("Helicopter", "agence2risques", Coordinates.setCoordinate(2, 10, 5));
		flyFactory.newAircraft("Balloon", "tourdumondeen80jours", Coordinates.setCoordinate(0, 0, 0));
		flyFactory.newAircraft(null, null, null);
	}		
}
