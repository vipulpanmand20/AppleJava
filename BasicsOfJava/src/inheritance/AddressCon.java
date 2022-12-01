package inheritance;

public class AddressCon 
{
	private int pincode;
	private String area,city,state;
	AddressCon()
	{
		pincode=410504;
		area="dfmv";
		city="Pune";
		state="Maharastra";
	}
	
	AddressCon(int pincode,String area,String city,String state)
	{
		this.pincode=pincode;
		this.area=area;
		this.city=city;
		this.state=state;
	}
	public String toString()
	{
		return +pincode+" "+area+" "+city+" "+state;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
