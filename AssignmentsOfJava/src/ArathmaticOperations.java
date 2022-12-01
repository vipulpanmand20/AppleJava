import java.util.Scanner;

public class ArathmaticOperations
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1, num2, add, sub, mul, div;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		num1 = sc.nextInt();
		System.out.println("enter second number:");
		num2 = sc.nextInt();
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		System.out.println("Addition is:" + add);
		System.out.println("Substraction is:" + sub);
		System.out.println("Multiplaction is:" + mul);
		System.out.println("Division is:" + div);

	}
}
