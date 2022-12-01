import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double interest, principal, rate, time;
		System.out.println("Enter the principle");
		principal = sc.nextDouble();
		System.out.println("Enter the rate");
		rate = sc.nextDouble();
		System.out.println("Enter the time");
		time = sc.nextDouble();
		interest = (principal * rate * time) / 100;
		System.out.println("Principal:" + principal);
		System.out.println("Rate:" + rate);
		System.out.println("Time is:" + time);
		System.out.println("Simple Interest:" + interest);
		sc.close();

	}

}
