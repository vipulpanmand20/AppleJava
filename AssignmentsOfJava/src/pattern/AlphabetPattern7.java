package pattern;

public class AlphabetPattern7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	/*	a a a a a 
		b b b b 
		c c c 
		d d 
		e */

		char ch='a';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}

	}

}
