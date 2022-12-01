import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 intgers to find Greatest Number");
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();
		System.out.println("Enter fourth Number");
		int num4 = sc.nextInt();
		if (num1 >= num2 && num1 >= num3 && num1 >= num4)
			System.out.println("the greatest number:" + num1);
		else if (num2 >= num1 && num2 >= num3 && num2 >= num4)
			System.out.println("the greatest number:" + num2);
		else if (num3 >= num1 && num3 >= num2 && num3 >= num4)
			System.out.println("the greatest number:" + num3);
		else if (num4 >= num1 && num4 >= num2 && num4 >= num3)
			System.out.println("the greatest number:" + num4);
		sc.close();

	}

}
