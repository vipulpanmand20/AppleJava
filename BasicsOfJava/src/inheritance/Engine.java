package inheritance;

public class Engine
{
    int cylinder,torque;
    String rpm,companey;    
	public int getCylinder() 
	{
		return cylinder;
	}

	public void setCylinder(int cylinder)
	{
		this.cylinder = cylinder;
	}

	public int getTorque()
	{
		return torque;
	}

	public void setTorque(int torque) 
	{
		this.torque = torque;
	}

	public String getRpm() 
	{
		return rpm;
	}

	public void setRpm(String rpm)
	{
		this.rpm = rpm;
	}

	public String getCompaney()
	{
		return companey;
	}

	public void setCompaney(String companey) 
	{
		this.companey = companey;
	}
	public String toString()
	{
		return"Companey:"+companey+"Rpm:"+rpm+"Torque:"+torque+"Cylinder:"+cylinder;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Engine e1=new Engine();
	}

}
