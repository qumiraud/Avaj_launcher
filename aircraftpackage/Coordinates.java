package aircraftpackage;

public class Coordinates 
{
	private int	longitude;
	private int	latitude;
	private int	height;

	Coordinates(int p_longitude, int p_latitude, int p_height)
	{
		this.longitude = p_longitude;
		this.latitude = p_latitude;
		this.height = p_height;
		System.out.println("Coordinates constructor called");
	};

	public int			getLongitude() { return this.longitude;};
	public int			getLatitude() { return this.latitude;};
	public int			getHeight() { return this.height;};

	public Coordinates	setCoordinate(int p_longitude, int p_latitude, int p_height)
	{
		return new Coordinates(p_longitude, p_latitude, p_height);
	}
}
