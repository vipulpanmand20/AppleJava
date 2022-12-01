import java.util.Scanner;

public class DiameterCircumferenceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, diameter, circumference, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of Circle:");
		radius = sc.nextDouble();
		diameter = radius * 2;
		System.out.println("Diameter of Circle:" + diameter);
		circumference = 2 * 3.14 * radius;
		System.out.println("Circumference of Circle:" + circumference);
		area = 3.14 * (radius * radius);
		System.out.println("Area Of Circle:" + area);

	}
}
