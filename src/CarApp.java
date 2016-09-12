
public class CarApp {

	public static void main(String[] args)
	{
		Car c = new Car();
		Car c2 = new Car();
		Driver d= new Driver();
		
		c.setVehicleType("Sports");
		System.out.println("This is a  " +c.getVehicleType());
		c2.setVehicleType("Hybrid");
		System.out.println("This is a  " +c2.getVehicleType());
		
		c.setName("Porche");
		System.out.println("It is a " +c.getName());
		c2.setName("Prius");
		System.out.println("It is a " +c2.getName());
		
		c.setVehicleColour("red");
		System.out.println("It is " +c.getVehicleColour() +"colour");
		c2.setVehicleColour("Blue");
		System.out.println("It is " +c2.getVehicleColour() +"colour");
		

		
		c.setStart("Has Started");
		System.out.println("The " +c.getVehicleColour()+c.getName()+ "  " +c.getStart());
		c2.setStart("Has Started");
		System.out.println("The " +c2.getVehicleColour()+c2.getName()+ "  "+c2.getStart());

		c.setSpeed(80);
		System.out.println("It is running at the speed of  " +c.getSpeed());
		c2.setSpeed(20);
		System.out.println("It is running at the speed of  " +c2.getSpeed());
		
		c.setDriver(d);
		d.setDriverName("Bob");
		Driver bob = c.getDriver();
		System.out.println("The driver of " +c.getName()+ " is " +bob.getDriverName());
		
		c.setDriver(d);
		d.setLicense("57575865BBHJUL");
		System.out.println("Driver's license is : " +c.getDriver().getLicense());
	}

}
