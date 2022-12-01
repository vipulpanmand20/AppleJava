package constructrsWritten;

public class AlphabetPattern {
	AlphabetPattern(int num) {
		int alpha = 65;
		for (int i = num; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (j + alpha) + " ");

			}
			System.out.println();
		}
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (j + alpha) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabetPattern ap = new AlphabetPattern(5);
	}
}
