package forloop;
import java.util.Scanner;

public class FibonacciNoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row num");
		int row=sc.nextInt();
		int a=0,b=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println(" ");
		}
         sc.close();
	}

}
