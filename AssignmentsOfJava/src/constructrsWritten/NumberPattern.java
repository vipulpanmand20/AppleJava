package constructrsWritten;

public class NumberPattern 
{
	NumberPattern()
	{
		int num=9;
      for(int i=num;i>=1;i--)
      {
    	 for(int s=i;s>1;s--)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=i;j<=num;j++)
    	  {
    		  System.out.print(j);
    	  }
    	  for(int k=num-1;k>=i;k--)
    	  {
    		  System.out.print(k);
    	  }
    	  System.out.println(" ");
      }
	
	}
	public static void main(String[] args) 
	{
		NumberPattern np1=new NumberPattern();
		
		
	}
}
