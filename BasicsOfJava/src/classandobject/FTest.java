package classandobject;

public class FTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " ");
			b = a + b;
			a = b - a;
		}
	}

}
