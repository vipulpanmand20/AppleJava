package whileloop;

import java.util.Scanner;

public class ReveseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, rev = 0, rem;
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while (num!=0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("Reverse no.is:" +rev);
		sc.close();

	}

}
