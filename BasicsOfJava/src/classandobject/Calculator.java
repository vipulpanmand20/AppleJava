package classandobject;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add();
		c1.subtract();
		c1.multiplation();
		c1.division();
	}

	void add() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition is:" + (a + b));
	}

	void subtract() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Substraction is:" + (a - b));
	}

	void multiplation() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Multiplacation is:" + (a * b));
	}

	void division() {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Division is:" + (a / b));
	}

}
