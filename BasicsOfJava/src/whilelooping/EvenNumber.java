package whilelooping;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		num = sc.nextInt();
		while (i <= num) {
			if (i % 2 == 0)
				System.out.println(i + " ");
			i++;

		}
		// i++; infinite loop
		System.out.println("Done");
		sc.close();

	}

}
