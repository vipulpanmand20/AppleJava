package whilelooping;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		while (limit > i) { // limit=10

			System.out.println(limit);// 9
			limit--;

		}

	}
}