package forloop;
import java.util.Scanner;

public class Palinndrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int N=sc.nextInt();
		System.out.println("Palindrome number from 100 to 400:");
		for(int i=1;i<=N;i++)
		{
			num=i;
			while(num >0)
			{
				a=num%10;
				rev=rev*10+a;
				num=num/10;
				
			}
		
		if(rev==i)
		{
			System.out.println(i+" ");
		}
		}
	}


		
		
		
		

	}

