package forloop;
import java.util.Scanner;
public class CalculatesPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base number::");
		base = sc.nextInt();
		System.out.println("Enter the Exponet Number::");
		exp = sc.nextInt();
		for (int i = 1; i < exp; i++) {
			base = base * base;

		}

		System.out.println("Power is:" + base);
	}

}

