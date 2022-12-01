package classandobject;

import java.util.Scanner;

public class BonusPfCalculator {
	
	float bonus(float salary, char ch)
	{
		float newSal;
		System.out.println("Original Salary:" + salary);
		if (ch == 'A')
			newSal =(float)(salary + (salary*0.15));
		else if (ch == 'B')
			newSal = salary + (salary * 0.10f);
		else if (ch == 'C')
			newSal = salary + (salary * 0.05f);
		else
			newSal = salary;
		
		System.out.println("salary after adding bonus:" + newSal);
		return newSal;
		
	}

	
	void PfCalculator(float salary) 
	{
		float pf = salary * 0.10f;
		System.out.println("pf:" + pf);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary,rating(A/B/C/D)of the employee:");
		int sal = sc.nextInt();
		char r = sc.next().charAt(0);
		
		BonusPfCalculator bpc = new BonusPfCalculator();
		// float newSal=bpc.bouns(sal,r);//return
		
		// bpc.PfCalculator(newSal);
		bpc.PfCalculator(bpc.bonus(sal, r));
	}


	

}
