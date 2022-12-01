import java.util.Scanner;

public class CalculatorSwitchExamaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Substraction\n3.Division\n4.Multiplacation");
		System.out.println("Enter Your Choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter two number for addition");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition is:" + (a + b));
			break;
		case 2:
			System.out.println("Enter two number for Substraction");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Substraction is:" + (a - b));
			break;
		case 3:
			System.out.println("Enter two number for Multiplaction");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Multiplacation is:" + (a * b));
			break;
		case 4:
			System.out.println("Enter two number for Division");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Division is:" + (a / b));
			break;
		default:
			System.out.println("Enter valid option");

		}

	}

}
