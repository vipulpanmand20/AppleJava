package pattern;

public class AlphabetPattern1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	/*A
      ABA
      ABCBA
      ABCDCBA
      ABCDEDCBA*/	
		for (int i = 1; i <= 5; i++)

		{
			char ch = 'A'; // a=97 A=65
			for (int j = 1; j <= i; j++) // j=1
			{
				System.out.print(ch); // A
				ch++; // ch=B
			}
			ch--;
			for (int k = i-1; k >= 1; k--) {
				ch--;
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
