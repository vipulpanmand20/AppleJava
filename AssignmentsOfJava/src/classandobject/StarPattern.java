package classandobject;
import java.util.Scanner;
public class StarPattern {
	int row;
	void star()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPattern st=new StarPattern();
		st.star();

	}

}
