package pattern;

public class AlphabetPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /* A
		ABC
		ABCDC
		ABCDEDC
		ABCDEFEDC*/
		for (int i = 1; i <= 5; i++)

		{
			char ch = 'A'; // a=97 A=65
			for (int j = 1; j <= i; j++) // j=1
			{
				System.out.print(ch); // A
				ch++; // ch=B
			}
			for (int k = i-1; k >= 1; k--) {
				
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}

}
