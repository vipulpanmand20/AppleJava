package whileloop;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = 521, num;
		num = sc.nextInt();
		while (i >= num) {
			if (i % 2 != 0) {
				System.out.println(i + "");
				i = i - 2;
			}
		}
		System.out.println("Odd number is");
		sc.close();
	}

}
