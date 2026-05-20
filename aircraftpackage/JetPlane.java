package aircraftpackage;

public class JetPlane extends Aircraft
{
	public JetPlane(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
		System.out.println("JetPlane constructor called");
	}
	public void	updateConditions()
	{
		System.out.println("JetPlane upConditions function called");
		String currentWeather = this.weatherTower.getWeather(this.coordinates);
		switch (currentWeather) {
			case "RAIN":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude() + 5, this.coordinates.getHeight());
				break;
			case "FOG":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude() + 1, this.coordinates.getHeight());
				break;
			case "SUN":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude() + 10, this.coordinates.getHeight() + 2);
				break;
			case "SNOW":
				this.coordinates.setCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 7);
				break;
			default:
				break;
		};
		
	};
}
