package inheritance;

public class Car 
{
	int id,price;
	String name,colour;
	Engine e;
	public Engine getE() 
	{
		return e;
	}
	public void setE(Engine e)
	{
		this.e=e;
	}
	public int getId()
	{
		return id;
	}


	public void setId(int id) 
	{
		this.id = id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() 
	{
		return colour;
	}


	public void setColor(String Colour) {
		this.colour =colour;
	}
	public String toString()
	{
		return"Id:"+id+"Name:"+name+"Colour:"+colour+"Price:"+price;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Car c1=new Car();
      
	}

}
