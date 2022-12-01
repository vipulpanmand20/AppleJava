   package inheritance;

public class CarCon 
{

	int id,price;
	String name,colour;
	Engine e;
	CarCon()
	{
		id=111;
		price=600000;
		name="Swift";
		colour="white";
	}
	
	CarCon(int id,String name,int price,String colour,Engine e)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.colour=colour;
		this.e=e;
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+colour+" \n"+e;
		
	}
	void display()
	{
		System.out.println("Car Name:"+name);
		System.out.println("Car Price:"+price);
		System.out.println("Car Colour:"+colour);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
	}

}
