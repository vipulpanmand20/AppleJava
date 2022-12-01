package constructor;

public class Movie1
{
	int id;
	String name,producer;
	{
		System.out.println("In instance block 1..!!!");
		id=1;
		name="0000";
		producer="aaaa";
	}
	Movie1()
	{
		System.out.println("In simple constructor..!!");
		id=00;
		name="nnnn";
		producer="pppp";
		
	}
	void setData(int id,String name,String producer)
	{
		this.id=id;
		this.name=name;
		this.producer=producer;
	}
		
		void display()
		{
			System.out.println(id+" "+name+" "+producer);
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance block will be called for every object creation
		//before constructor
    Movie1 m1=new Movie1();
    //m1.setData(111,"Bramhastra","karan johar");
    m1.display();
    System.out.println("\n-----------------********---------------\n");
    Movie1 m2=new Movie1();
    m2.display();
    
    
	}

}
