package weatherpackage;
import java.util.ArrayList;
import aircraftpackage.Flyable;

public abstract class Tower
{
	private ArrayList<Flyable>	observerArrayList = new ArrayList<Flyable>();

	public void		register(Flyable p_flyable) { };
	public void		unregister(Flyable p_flyable) { };
	protected void	conditionChanged()
	{
		for (int i = 0; i < observerArrayList.size(); i++)
		{
			observerArrayList.get(i).updateConditions();
		}
	};
}
