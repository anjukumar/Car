
public class Car extends Vehicle
{
	private int speed;
	private String name;
	private String start;
	private String stop;
	private Driver driver;
	private Person passenger;
	
	public String getName()
	{
	return name;	
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getSpeed()
	{
	return speed;	
	}
	
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	
	public String getStart()
	{
	return start;	
	}
	
	public void setStart(String start)
	{
		this.start=start;
	}
	
	public String getStop()
	{
	return stop;	
	}
	
	public void setStop(String stop)
	{
		this.stop=stop;
	}

	public Driver getDriver()
	{
	return driver;	
	}
	
	public void setDriver(Driver driver)
	{
		this.driver=driver;
	}
	
	public Person getPassenger()
	{
	return passenger;	
	}
	
	public void setPassenger(Person passenger)
	{
		this.passenger=passenger;
	}
	
}