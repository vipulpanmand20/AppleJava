import java.util.Scanner;

public class AreaOfTriangleHard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the width of the Triangle:");
		double b = sc.nextDouble();
		System.out.println("enter the height of the Triangle: ");
		double h = sc.nextDouble();
		double area = (b * h) / 2;
		System.out.println("Area Of Triangle is:" + area);

		sc.close();
	}
}
