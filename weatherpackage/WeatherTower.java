package weatherpackage;

import aircraftpackage.Coordinates;
import ownexceptionpackage.DefaultCaseException;

public class WeatherTower extends Tower
{
	public String	getWeather(Coordinates p_coordinates){ return WeatherProvider.getCurrentWeather(p_coordinates);};
	public void		changeWeather() throws DefaultCaseException
	{
		this.conditionChanged();
	};
}
