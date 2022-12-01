package classandobject;
import java.util.Scanner;
public class Student 
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
	
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid=sc.nextInt();//initilized the global variable via method
		System.out.println("Enter the name:");
		String sname=sc.next();
		System.out.println("Enter the marks:");
		int smarks=sc.nextInt();
		System.out.println("Enter the dept:");
		String sdept=sc.next();
		}*/
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid=sc.nextInt();
		System.out.println("Enter the name:");
		String sname=sc.next();
		System.out.println("Enter the marks:");
		int smarks=sc.nextInt();
		System.out.println("Enter the dept:");
		String sdept=sc.next();
		Student s1=new Student();
		s1.setData(sid,sname,sdept,smarks);
		s1.display();
		Student s2=new Student();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid1=sc1.nextInt();
		System.out.println("Enter the name:");
		String sname1=sc1.next();
		System.out.println("Enter the marks:");
		int smarks1=sc1.nextInt();
		System.out.println("Enter the dept:");
		String sdept1=sc1.next();
		s2.setData(sid1,sname1,sdept1,smarks1);
		s2.display();
		Student s3=new Student();
		Scanner sc11=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid2=sc11.nextInt();
		System.out.println("Enter the name:");
		String sname2=sc11.next();
		System.out.println("Enter the marks:");
		int smarks2=sc11.nextInt();
		System.out.println("Enter the dept:");
		String sdept2=sc11.next();
		s3.setData(sid2,sname2,sdept2,smarks2);
		s3.display();
		Student s4=new Student();
		Scanner sc22=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid3=sc22.nextInt();
		System.out.println("Enter the name:");
		String sname3=sc22.next();
		System.out.println("Enter the marks:");
		int smarks3=sc22.nextInt();
		System.out.println("Enter the dept:");
		String sdept3=sc22.next();
		s4.setData(sid,sname,sdept,smarks);

		
		
		
	}

}
