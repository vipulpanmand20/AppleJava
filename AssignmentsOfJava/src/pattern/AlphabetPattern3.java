package pattern;

public class AlphabetPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  A
		  B B 
		  C C C 
		  D D D D
		  E E E E E
		 */
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
		}
	}

}
