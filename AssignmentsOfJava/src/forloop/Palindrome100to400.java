package forloop;

import java.util.Scanner;

public class Palindrome100to400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		num = sc.nextInt();
		for (int i = 100; i <= num; i++) {
			int n = i;
			int rev = 0;
			while (n > 0) {
				int r = n % 10;
				rev = rev * 10 + r;
				n = n / 10;
			}
			if (rev == i) {
				System.out.print(i + " ");
			}
		}
	}

}
