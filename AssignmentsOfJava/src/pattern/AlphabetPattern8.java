package pattern;

public class AlphabetPattern8 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*	e d c b a 
		e d c b 
		e d c 
		e d 
		e */

     for(int i=5;i>=1;i--)
     {
    	 char ch='e';
    	 for(int j=1;j<=i;j++)
    	 {
    		 System.out.print(ch+" ");
    		 ch--;
    		 
    	 }
    	 System.out.println();
     }
	}

}
