package weatherpackage;

import aircraftpackage.Coordinates;

public final class WeatherProvider 
{
	private static String[] weather = {"Rain", "FOG", "SUN", "SNOW"};
	private static volatile WeatherProvider	instance;

	private WeatherProvider() { System.out.println("WeatherProvider constructor called"); };

	public static WeatherProvider getInstance() {
		WeatherProvider result = instance;
		if (result != null)
			return result;
		synchronized(WeatherProvider.class){
			if (instance == null)
				instance = new WeatherProvider();
		}
		return instance;
	};

	public static String getCurrentWeather(Coordinates p_coordinates) { return weather[(p_coordinates.getLatitude() + p_coordinates.getLongitude() + p_coordinates.getHeight()) % 3]; };
}
