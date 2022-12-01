package constructor;
import java.util.Scanner;
public class Employee 
{
	private int id,salary;
	private String name,dept,contact;
	Employee()
	{
		id=1;
		name="";
		dept="";
		salary=0;
	}
	//public getters setters
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
	     return name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getdept()
	{
	     return dept;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
	     return contact;
	}
	void display()
	{
		System.out.println("emp Id:"+id);
		System.out.println("emp name:"+name);
		System.out.println("emp dept name:"+dept);
		System.out.println("emp salary:"+salary);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		 Employee e1=new Employee();
		 for(int i=0;i<no;i++)
		 {
			 System.out.println("enter emp id:");
			 int id=sc.nextInt();
			 System.out.println("enter name employee:");
			 String name=sc.next(); 
			 System.out.println("enter dept name of emp:");
			 String dept=sc.next();
			 System.out.println("enter emp salary:");
			 e1.display();
			 
	
			
	}

}
}
