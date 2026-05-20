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
	};
}
