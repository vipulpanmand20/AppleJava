package whilelooping;
import java.util.Scanner;

public class CalculatorSwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char ch1;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Addition \n2.Substraction\n3.Division \n4.Multiplication");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)//==int byte short long string char
			{
			case 1:
				System.out.println("Enter two numbers for addition:");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Addition is:"+(a+b));
				break;
			case 2:
				System.out.println("Enter two numbers for substraction:");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Substraction is:"+(a -b));
				break;
			case 3:
				System.out.println("Enter two numbers for multiplaction:");
				a = sc.nextInt();
				b=sc.nextInt();
				System.out.println("multiplaction is:"+(a * b));
				break;
			case 4:
				System.out.println("Enter two numbers for Division:");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Division is:"+(a/b));
				break;
				default:
					System.out.println("enter valid option");
			}
					ch1=sc.next().charAt(0);
		}while(ch1=='Y'||ch1=='y');
			}
		

	}


