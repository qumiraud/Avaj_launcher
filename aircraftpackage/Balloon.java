package aircraftpackage;

// import weatherpackage.WeatherTower;

public class Balloon extends Aircraft
{
	public Balloon(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
		System.out.println("Balloon constructor called");
	}
	public void	updateConditions()
	{
		System.out.println("Balloon upConditions function called");
		String currentWeather = this.weatherTower.getWeather(this.coordinates);
		switch (currentWeather) {
			case "RAIN":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 5);
				break;
			case "FOG":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 3);
				break;
			case "SUN":
				this.coordinates.setCoordinate(this.coordinates.getLongitude() + 2, this.coordinates.getLatitude(), this.coordinates.getHeight() + 4);
				break;
			case "SNOW":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 15);
				break;
			default:
				break;
		}
	};
}
