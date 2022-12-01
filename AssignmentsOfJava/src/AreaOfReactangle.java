import java.util.Scanner;

public class AreaOfReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, breadth, perimeter, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of rectangle:");
		length = sc.nextInt();
		System.out.println("enter breadth of rectangle:");
		breadth = sc.nextInt();
		perimeter = (length + breadth) * 2;
		System.out.println("Perimeter of rectangle:" + perimeter);
		area = length + breadth;
		System.out.println("Area Of Rightangle:" + area);

	}

}
