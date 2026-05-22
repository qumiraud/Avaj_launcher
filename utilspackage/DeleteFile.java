package utilspackage;

import java.io.File;

public class DeleteFile 
{
	public static void deleteScenario()
	{
		File myObj = new File("simulation.txt"); 
		if (myObj.delete())
			System.out.println("File erase to new simulation: " + myObj.getName());
		else
			System.out.println("Failed to delete the file.");
	}
}
