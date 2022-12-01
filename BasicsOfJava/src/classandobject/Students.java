package classandobject;
import java.util.Scanner;
public class Students 
{
	    int id;
		String name;
		int s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		
	void accept()
	{
		System.out.println("Accept students info\n");
		System.out.println("Enter students id:");
		id=sc.nextInt();
		System.out.println("enter student name:");
		name=sc.next();
		System.out.println("Enter the 3 subject marks:");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
	}
	void display()
	{
		System.out.println("\n*******Students Information is******\n");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Three Subject Marks:");
		System.out.println("Php:"+s1);
		System.out.println("Java:"+s2);
		System.out.println("C++:"+s3);
	}

	void calculate()
	{
		int total= s1 + s2 + s3;
		int percentage=total/3;
		System.out.println("\n percentage is:"+percentage);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Students s1=new Students();
		s1.accept();
		s1.display();
		s1.calculate();
}
}
