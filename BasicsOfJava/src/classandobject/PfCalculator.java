package classandobject;

import java.util.Scanner;

public class PfCalculator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary:");
		int a=sc.nextInt();
		PfCalculator c1=new PfCalculator();
		c1.salary(a);
	}
		void salary(int a)
		{	
		System.out.println("Salary:"+(a*0.15));	
	    }
	}

