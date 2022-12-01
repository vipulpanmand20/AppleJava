package classandobject;

public class Employee {
	int eid;
	String name;
	int sal;
	void acceptDetails()
	{
		eid=100;
		name="Vishal";
		sal=67000;
	}
	void display()
	{
		System.out.println(eid+" "+name+" "+sal);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Employee e=new Employee();
     e.acceptDetails();
     e.display();
	}

}
