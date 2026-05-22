package ownexceptionpackage;
import java.lang.Exception;

public class NegativeCoordinatesException extends Exception 
{
	public NegativeCoordinatesException()
	{
		super("A Coordinate with a negative value has been detected, so a NegativeCoordinatesException has been thrown");
	}
}
