package aircraftpackage;

public class Helicopter extends Aircraft
{
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
		System.out.println("Helicopter constructor called");
	};
	public void	updateConditions()
	{
		System.out.println("Helic upConditions function called");
		String currentWeather = this.weatherTower.getWeather(this.coordinates);
		switch (currentWeather) {
			case "RAIN":
				this.coordinates.setCoordinate(this.coordinates.getLongitude() + 5, this.coordinates.getLatitude(), this.coordinates.getHeight());
				break;
			case "FOG":
				this.coordinates.setCoordinate(this.coordinates.getLongitude() + 1, this.coordinates.getLatitude(), this.coordinates.getHeight());
				break;
			case "SUN":
				this.coordinates.setCoordinate(this.coordinates.getLongitude() + 10, this.coordinates.getLatitude(), this.coordinates.getHeight() + 2);
				break;
			case "SNOW":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 12);
				break;
			default:
				break;
		};
	}
}
