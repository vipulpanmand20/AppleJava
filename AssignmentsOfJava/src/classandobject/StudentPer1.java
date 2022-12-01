package classandobject;
import java.util.Scanner;
public class StudentPer1 
{
	int calculate(int s1,int s2,int s3)
	{
	int total=s1+s2+s3;
	int per=total/3;
	return per;
	}

	void display(int per)
	
	{
		System.out.println("Percentage:"+per);
		if(per>=80 && per<=100)
		{
			System.out.println("First class");
		}
		else if(per>=60 && per<=80)
		{
			System.out.println("Second class");
		}
		else if(per>=40 && per<=60)
		{
			System.out.println("Third class");
		}

	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   StudentPer1 p1=new StudentPer1();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter marathi marks");
	  int s1=sc.nextInt();
	  System.out.println("Enter Hindi marks");
	   int s2=sc.nextInt();
	   System.out.println("Enter English marks");
	   int s3=sc.nextInt();
	   int per= p1.calculate(s1,s2,s3);
	   p1.display(per);

	}


}

