
public class Driver extends Person
{
	private String license;
	private String dname;

	public String getDriverName()
	{
		return dname;	
	}

	public void setDriverName(String dname)
	{
		this.dname=dname;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

}
