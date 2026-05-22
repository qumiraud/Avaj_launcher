import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import aircraftpackage.*;
import weatherpackage.*;
import ownexceptionpackage.*;
import utilspackage.DeleteFile;



public class Simulate 
{
	private final int			MAX_HEIGHT = 100;
	private int					iteration;
	private ArrayList<String[]>	tab = new ArrayList<String[]>();

	public void parseFile(String file)
	{
		File myObj = new File("scenario.txt");
		try (Scanner myReader = new Scanner(myObj))
		{
			int i = 0;
			// String regex = "^[a-zA-Z0-9_-]+\\s[a-zA-Z0-9_-]+\\s(\\d+)\\s(\\d+)\\s(\\d+)$";
			while (myReader.hasNextLine()) 
			{
				String data = myReader.nextLine();
				if (i == 0)
					this.iteration = Integer.parseInt(data);
				else
					this.tab.add(data.trim().split("\\s+"));
				i++;
			}
		}
		catch (FileNotFoundException e) 
		{
				System.out.println("An error occurred.");
				e.printStackTrace();
		}
	}
	public void launch() throws NegativeCoordinatesException, DefaultCaseException
	{
		DeleteFile.deleteScenario();
		WeatherTower			controlTower = new WeatherTower();
		for (int i = 0; i < this.tab.size(); i++)
		{
			String	type = tab.get(i)[0];
			String	name = tab.get(i)[1];
			int		longitude = Integer.parseInt(tab.get(i)[2]);
			int		latitude = Integer.parseInt(tab.get(i)[3]);
			int		height = Integer.parseInt(tab.get(i)[4]);
			if (longitude < 0 || latitude < 0 || height < 0)
				throw new NegativeCoordinatesException();
			if (height > MAX_HEIGHT)
				height = MAX_HEIGHT;

			Flyable plane = AircraftFactory.getInstance().newAircraft(type, name, Coordinates.setCoordinate(longitude, latitude, height));
			plane.registerTower(controlTower);
			controlTower.register(plane);
		}
		for (int i = 0; i < this.iteration; i++)
		{
			controlTower.changeWeather();
		}
	}

}
