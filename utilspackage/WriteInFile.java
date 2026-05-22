package utilspackage;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
	public static void writeLogs(String str)
	{
		try
		{
			FileWriter myWriter = new FileWriter("simulation.txt", true);
			myWriter.write(str + "\n");
			myWriter.close();
		}
		catch (IOException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
}
