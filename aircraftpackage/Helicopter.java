package aircraftpackage;

import utilspackage.WriteInFile;

public class Helicopter extends Aircraft
{
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
	};
	public void	updateConditions()
	{
		if (this.coordinates.getHeight() <= 0)
		{
			weatherTower.unregister(this);
			return ;
		}
		String currentWeather = this.weatherTower.getWeather(this.coordinates);
		switch (currentWeather) {
			case "RAIN"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): That looks like me in the shower!");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude() + 5, this.coordinates.getLatitude(), this.coordinates.getHeight());}
			case "FOG"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): Here's a helicopter with a misting system option.");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude() + 1, this.coordinates.getLatitude(), this.coordinates.getHeight());}
			case "SUN"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): Let's go for a game of treasure map!");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude() + 10, this.coordinates.getLatitude(), this.coordinates.getHeight() + 2);}
			case "SNOW"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): I would like a snowcrash.");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 12);}
		};
	}
}
