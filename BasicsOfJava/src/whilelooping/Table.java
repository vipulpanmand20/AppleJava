package whilelooping;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		no = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(no * i);
			i++;
		}

	}
}
