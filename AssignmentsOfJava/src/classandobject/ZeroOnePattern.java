package classandobject;

import java.util.Scanner;

public class ZeroOnePattern 
{
	int row;

	void zeroOne()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows:");
		row = sc.nextInt();
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 0; j < i; j++)
			{
				if(i%2==0)
				{
			   System.out.print(1);
			    		 
			    }
			    	 else
			    		 System.out.print(0);
			    	 }
			    	 System.out.println();
			}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroOnePattern zo = new ZeroOnePattern();
		zo.zeroOne();

	}

}
