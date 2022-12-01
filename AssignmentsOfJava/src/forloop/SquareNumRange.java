package forloop;
import java.util.Scanner;
public class SquareNumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range of limit");
	    num=sc.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	    	System.out.println(i+" ");
	    }
		sc.close();

	}

}
