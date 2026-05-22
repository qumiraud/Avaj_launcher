
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("New simulation begin.");
		Simulate simulation = new Simulate();

		simulation.parseFile(args[0]);
		try{
			simulation.launch();
		}
		catch (Exception e)
		{
				e.printStackTrace();
		}
	}
}
