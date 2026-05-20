import aircraftpackage.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Starting project");
		Simulate simulation = new Simulate();

		File myObj = new File("filename.txt");
		try (Scanner myReader = new Scanner(myObj))
		{
			int i = 0;
			while (myReader.hasNextLine()) 
			{
				String data = myReader.nextLine();
				if (i == 0)
					simulation.iteration = Integer.parseInt(data);
				System.out.println(data);
				i++;
			}
		}
		catch (FileNotFoundException e) 
		{
				System.out.println("An error occurred.");
				e.printStackTrace();
		}
	}
}
