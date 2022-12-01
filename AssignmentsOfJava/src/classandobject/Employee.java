package classandobject;

import java.util.Scanner;

public class Employee
{
	int id,salary,contact;
	String name,dept,email;
	void setData(int i,String n,String d,int s,int cnt,String mail)
	{
		id=i;
		name=n;
		dept=d;
		salary=s;
		contact=cnt;
		email=mail;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+contact+" "+email);
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Employees:");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("Enter data for"+i+"Employee:");
		    System.out.println("Enter the id:");
		    int sid=sc.nextInt();
		    System.out.println("Enter the name:");
		    String sname=sc.next();
		    System.out.println("Enter the salary:");
		    int ssalary=sc.nextInt();
		    System.out.println("Enter the dept:");
		    String sdept=sc.next();
		    System.out.println("Enter the contact:");
		    int scnt=sc.nextInt();
		    System.out.println("Enter the Email:");
		    String smail=sc.next();
		    
		     Employee e1=new Employee();
		     e1.setData(sid,sname, sdept,ssalary,scnt,smail);
		     e1.display();
		}
		     
	}

}
