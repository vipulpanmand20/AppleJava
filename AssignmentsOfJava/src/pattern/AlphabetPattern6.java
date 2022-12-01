package pattern;

public class AlphabetPattern6
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*	a
		ab
		abc
		abcd
		abcde*/

      for(int i=1;i<=5;i++)
      {
    	  char ch='a';
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(ch);
    		  ch++;
    	  }
    	  System.out.println();
    	 
      }
	}

}
