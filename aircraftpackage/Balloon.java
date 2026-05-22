package aircraftpackage;

import utilspackage.WriteInFile;
import ownexceptionpackage.*;

public class Balloon extends Aircraft
{
	public Balloon(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
	}
	public void	updateConditions() throws DefaultCaseException
	{
		if (this.coordinates.getHeight() <= 0)
		{
			weatherTower.unregister(this);
			return ;
		}
		String currentWeather = this.weatherTower.getWeather(this.coordinates);
			switch (currentWeather) {
				case "RAIN"		->{
					WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): Oh no... Are we in Bretagn?");
					this.coordinates = this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 5);}
				case "FOG"		->{
					WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): In this fog, we could be mistaken for a Drifblim.");
					this.coordinates = this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 3);}
				case "SUN"		->{
					WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): We're back to play a nasty trick on you.");
					this.coordinates = this.coordinates.updateCoordinate(this.coordinates.getLongitude() + 2, this.coordinates.getLatitude(), this.coordinates.getHeight() + 4);}
				case "SNOW"		->{
					WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): We'd be better off stopping with weather like this.");
					this.coordinates = this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 15);}
				default	->{
					throw new DefaultCaseException();
				}
			}
	};
}
