package classandobject;
import java.util.Scanner;
public class EmployeePf {
	int id;
	String name, dept;
	float salary,p;
	double contact;
	int rating;
	void input(int idd,String namee,String deptt,float salaryy,double contactt,int ratingg){
		id = idd;
		name = namee;
		dept = deptt;
		salary = salaryy;
		contact = contactt;
		
	}
	float bonus(int Salary,char ch)                          //
	{
		float newSal;
		System.out.println("Salary"+Salary);
		if(ch=='A')
			newSal=Salary+(Salary*0.15f);
		else if(ch=='B')
			newSal=Salary+(Salary*0.10f);
		else if(ch=='C')
			newSal=Salary+(Salary*0.5f);
		else 
			newSal=Salary;
		System.out.println("Salry after Bonus: "+newSal);
		return newSal;
		
	}
	
	void pfCalculator(float Salary) 
	{
		float pf=Salary*0.15f;
		System.out.println("pf iss:"+pf);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ENter Your ID");
		 int i=sc.nextInt();
		 System.out.println("Enter Your Name");
		 String n=sc.next();
	      System.out.println("Enter Employee Salary,Rating(A/B/C/D) of Emplyee: ");
	      char r=sc.next().charAt(0);   //Input for Rating
	      System.out.println("Enter Your Salary");
	      int sal=sc.nextInt();       //Input of Salary
	      
	      System.out.println(""+n);
	      EmployeePf bpc=new EmployeePf();
	      float newSal=bpc.bonus(sal,r);
	      bpc.pfCalculator(newSal);
		
	}
	}