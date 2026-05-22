package aircraftpackage;

import utilspackage.WriteInFile;

public class JetPlane extends Aircraft
{
	public JetPlane(long p_id, String p_name, Coordinates p_coordinates)
	{
		super(p_id, p_name, p_coordinates);
	}
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
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): KeepCalm, keepcaaAAAALLLMMMMM!");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude() + 5, this.coordinates.getHeight());}
			case "FOG"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): Ladys and Gentlemans, the flight in the direction of anywhere is arrived i don't know where");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude() + 1, this.coordinates.getHeight());}
			case "SUN"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): The person who looks at the sun through the porthole the longest wins a Lamborghini.");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude() + 10, this.coordinates.getHeight() + 2);}
			case "SNOW"		->{
				WriteInFile.writeLogs(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): It feels like we're going at the speed of light.");
				this.coordinates.updateCoordinate(this.coordinates.getLongitude(), this.coordinates.getLatitude(), this.coordinates.getHeight() - 7);}
		};
		
	};
}
