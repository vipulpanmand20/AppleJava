package forloop;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row no");
		row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			int no = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(no + " ");
                no=no+5-j;
			}
			System.out.println();
		}
	}

}
