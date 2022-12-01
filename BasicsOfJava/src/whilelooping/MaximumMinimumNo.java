package whilelooping;
import java.util.Scanner;

public class MaximumMinimumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		min=num%10;
		while(num!=0)
		{
			int r=num%10;
			if(r<min)
			{
				min=r;
				}
			num=num/10;
			
			}
		System.out.println("Addition of is:"+min);
		}

	}

