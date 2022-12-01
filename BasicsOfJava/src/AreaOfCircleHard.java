import java.util.Scanner;

public class AreaOfCircleHard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double pi = 3.14, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of Circle:");
		r = sc.nextInt();

		area = pi * r * r;
		System.out.println("Area Of Circle is:" + area);

		sc.close();
	}

}
