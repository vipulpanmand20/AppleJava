package forlooping;
import java.util.Scanner;
public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
		n=sc.nextInt();
		fact=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial is:" + fact);
	}

}
