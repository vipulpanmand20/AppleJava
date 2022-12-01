package classandobject;

import java.util.Scanner;

public class Student1 
{
	int id,marks;
	String name,dept;
	void setData(int i,String n,String d,int m)
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("Enter data for"+i+"student:");
		    System.out.println("Enter the id:");
		    int sid=sc.nextInt();
		    System.out.println("Enter the name:");
		    String sname=sc.next();
		    System.out.println("Enter the marks:");
		    int smarks=sc.nextInt();
		    System.out.println("Enter the dept:");
		    String sdept=sc.next();
		     Student s1=new Student();
		     s1.setData(sid,sname, sdept,smarks);
		     s1.display();
		}
		     
	}

}
