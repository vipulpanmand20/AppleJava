package constructor;

import java.util.Scanner;

public class EmployeeParameterrized {

	int id,salary;
	String name,dept;
	float pf;
	 EmployeeParameterrized()
	{
	id=01;
	name="Vishal";
	dept="aaaaa";
	pf=1;
	}
	 EmployeeParameterrized(int i,String n,String d,float p)
	 {
		 id=i;
		 name=n;
		 dept=d;
		 pf=p;
		 
		 
		 
	 }
void display()
{
	System.out.println(id+" "+name+" "+dept+" "+salary+" "+pf);
}
public String toString()
{
	 return id+" "+name+" "+dept+" "+salary+" "+pf;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
EmployeeParameterrized ep=new EmployeeParameterrized();
ep.display();
System.out.println("---------------------");
EmployeeParameterrized ep2=new  EmployeeParameterrized();
ep2.display();

System.out.println("----------------------------------");
EmployeeParameterrized ep3=new EmployeeParameterrized(1,"Vipul","hr",0.15f);
ep3.display();

System.out.println("----------------------------------");
EmployeeParameterrized ep4=new EmployeeParameterrized(2,"Ram","hr",0.15f);
ep4.display();

	}
}
