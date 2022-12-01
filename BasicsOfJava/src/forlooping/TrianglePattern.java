package forlooping;
import java.util.Scanner;
public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int r;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of triangle");
    r=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
    	for(int k=1;k<=r-i;k++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++){
    		System.out.print("* ");
    		
    	}
    }
	}
	}
