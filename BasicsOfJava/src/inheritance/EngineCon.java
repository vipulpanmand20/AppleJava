package inheritance;

public class EngineCon 
{
	  int cylinder,torque;
	    String rpm,companey; 
	    Engine e;
	    EngineCon()
	    {
	    	cylinder=2;
	    	torque=89;
	    	rpm="1000 rmp";
	    	companey="Maruti Suzuki";
	    }
	   EngineCon(int cylinder,int torque,String rpm,String companey,Engine e)
		{
			this.cylinder=cylinder;
			this.torque=torque;
			this.rpm=rpm;
			this.companey=companey;
			this.e=e;
		}
		public String toString()
		{
			return cylinder+" "+torque+" "+rpm+" "+companey+" \n"+e;
			
		}
		void display()
		{
			System.out.println("Cylinder quantity:"+cylinder);
			System.out.println("Torque:"+torque);
			System.out.println("Engine Rpm:"+rpm);
			System.out.println("Engine Companey:"+companey);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
