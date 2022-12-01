package whilelooping;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 345768, sum = 0, product = 1, cnt = 0;
		int min = num % 10;
		int max = num % 10;
		while (num != 0) {
			int r = num % 10;
			if (r < min)

			{
				min = r;
			}
			if (r > max) {
				max = r;
			}
			num = num / 10;
		}
		System.out.println("minimum digit is:" + min);
		System.out.println("maximum digit is:" + max);

	}
}
