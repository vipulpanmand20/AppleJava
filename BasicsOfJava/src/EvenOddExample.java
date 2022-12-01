import java.util.Scanner;

public class EvenOddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("The number is Even");

		} else
			System.out.println("The Number is Odd");
		sc.close();
	}

}
