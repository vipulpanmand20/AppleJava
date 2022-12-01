package forloop;

import java.util.Scanner;

public class KrishnmurthyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, fact=1, rem, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		sum = sc.nextInt();
		num = sc.nextInt();
		int temp = num;
		while (num != 0) {
			rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;

			}
			num = num / 10;
			sum = sum + fact;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println(temp + "IS Krishnmurthy Number");
		} else {
			System.out.println(temp + "Is not Krishnmurthy Number");
		}
		sc.close();
	}

}
