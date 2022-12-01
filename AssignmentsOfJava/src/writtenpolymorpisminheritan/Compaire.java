package writtenpolymorpisminheritan;

public class Compaire
{
	void compaire(int a, int b)
	{
		if(a>b)
		{
			System.out.println("Greater integer value is :"+a);
			
		}
		else
		{
			System.out.println("Greater integer value is:"+b);
			
		}
		
	}
	void compaire(char a, char b)
	{
		int x=(int) a;
		int y=(int)b;
		if(x>y)
		{
			System.out.println("Greater numeric value is:"+a);
		}
			else
			{
				System.out.println("Greater numeric value is:"+b);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compaire c=new Compaire();
		c.compaire(6, 9);
		c.compaire('a','x');

	}

}
