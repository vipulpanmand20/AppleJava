package pattern;

public class AlphabetPattern4
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      /*A 
		B C 
		D E F 
		G H I J 
		K L M N O */

		
      char ch = 'A';
	for (int i = 1; i <= 5; i++)
	{
		for (int j = 1; j <= i; j++) 
		{
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
	}

}
}
