package classandobject;

import java.util.Scanner;

public class CalculatorParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		CalculatorParameter c1 = new CalculatorParameter();
		c1.add(a, b);
		c1.multiply(a, b);
		c1.subtract(a, b);
		c1.division(a, b);
	}

	void add(int a, int b) {
		System.out.println("addition is:" + (a + b));

	}

	void multiply(int a, int b) {
		System.out.println("multiplaction is:" + (a * b));

	}

	void subtract(int a, int b) {
		System.out.println("substration is:" + (a - b));

	}

	void division(int a, int b) {
		System.out.println("division is:" + (a / b));

	}

}
