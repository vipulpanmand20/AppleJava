package whilelooping;

public class EvenOddNumberAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 48, sum = 0;
		while (num != 0) {
			int r = num % 10;
			if (r % 2 == 0) {
				sum = sum + r;

			}
			num = num / 10;
			System.out.println("Addition of even no:" + sum);
		}

	}

}
