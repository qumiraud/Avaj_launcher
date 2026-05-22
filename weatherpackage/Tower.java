package weatherpackage;
import java.util.ArrayList;

import aircraftpackage.Aircraft;
import aircraftpackage.Flyable;
import ownexceptionpackage.DefaultCaseException;
import utilspackage.WriteInFile;

public abstract class Tower
{
	private ArrayList<Flyable>	observerArrayList = new ArrayList<Flyable>();

	public void		register(Flyable p_flyable) 
	{
		observerArrayList.add(p_flyable);
		WriteInFile.writeLogs("Tower says: " + p_flyable.toTowerRegisterMsg() + "registered to weather tower.");
	};
	public void		unregister(Flyable p_flyable) 
	{
		observerArrayList.remove(p_flyable); 
		WriteInFile.writeLogs("Tower says: " + p_flyable.toTowerRegisterMsg() + "unregistered from weather tower.");
	};
	protected void	conditionChanged() throws DefaultCaseException
	{
		for (int i = 0; i < observerArrayList.size(); i++)
				observerArrayList.get(i).updateConditions();
	};
}
