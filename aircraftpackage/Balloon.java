package aircraftpackage;

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
	};
}
