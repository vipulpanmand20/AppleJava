package classandobject;
import java.util.Scanner;
public class SumOfFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFactor f1 = new SumOfFactor();
		f1.calculate(12);
	}
	void calculate(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
		}
		}
		System.out.println("Sum of factor is:"+sum);
	}
   
	}


