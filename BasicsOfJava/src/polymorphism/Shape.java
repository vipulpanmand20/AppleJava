package polymorphism;

public class Shape {
	void areaOfCircle(double pi, int r) {
		System.out.println("Area of circle is:" + (pi * r * r));
	}

	void areaOfSquare(int a, int i) {
		System.out.println("Area of square is:" + (a * a));

	}

	void areaOfRightAngletri(float b, float h) {
		System.out.println("Area of rightangleTriangle is:" + (b * h / 2));
	}

	void areaOfRightAngle(int l, float b) {
		System.out.println("Arae of right angle is:" + (l * b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		s1.areaOfSquare(4, 4);
		s1.areaOfCircle(3.14, 8);
		s1.areaOfRightAngletri(21, 10);
		s1.areaOfRightAngle(4, 4);
	}

}
