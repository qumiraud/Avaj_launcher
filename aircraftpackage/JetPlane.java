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
	};
}
