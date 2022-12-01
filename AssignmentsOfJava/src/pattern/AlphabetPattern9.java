package pattern;

public class AlphabetPattern9 
{

	public static void main(String[] args) 
	{
/*		a c e g i 
		a c e g 
		a c e 
		a c 
		a */
		//char ch='a';
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			int x=96;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+x)+" ");
				x++;
			}
				System.out.println();
			}
			
		}

	}


