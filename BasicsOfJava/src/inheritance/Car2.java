package inheritance;

public class Car2 
{
	int id,price;
	String name,color;
	Driver d;
	
	Car2(int id,String name,int price,String color,int did,String dname,String dcontact)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.color=color;
		this.d=d;
		
	    d=new Driver(int did,String dname,String dcontact);
	}
	public String toString()
	{
		return +id+" "+name+" "+price+" "+color+"\n"+d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}