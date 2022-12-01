package forlooping;
import java.util.Scanner;
public class Harshad_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		num=sc.nextInt();
		int n=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(n % sum==0)
		{
			System.out.println(n+"Is Harshad No");
		}
		else
			System.out.println(n+"Is Not Harshad No");
		{
		}
	}

}
