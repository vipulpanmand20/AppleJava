package pattern;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=row-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
