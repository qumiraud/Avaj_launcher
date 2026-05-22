package aircraftpackage;

import ownexceptionpackage.DefaultCaseException;
import weatherpackage.*;

public abstract class Flyable 
{
	protected WeatherTower	weatherTower;

	public abstract void				updateConditions() throws DefaultCaseException;
	public void							registerTower(WeatherTower p_tower){ this.weatherTower = p_tower; };
	public abstract String				toTowerRegisterMsg();

}
