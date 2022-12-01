import java.util.Scanner;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number, root;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		number = sc.nextDouble();
		root = sc.nextInt();
		root = (double)Math.sqrt(number);
		System.out.println("Square root of::" + number + root);

	}

}
