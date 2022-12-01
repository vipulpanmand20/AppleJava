package forlooping;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
