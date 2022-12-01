package whileloop;
import java.util.Scanner;
public class DigitProductNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num,temp,product=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number:");
    num=sc.nextInt();
    temp=num;
    while(temp!=0)
    {
    	product=product*(temp % 10);
    	temp=temp/10;
    }
    System.out.println("Product Of All digits:"+product);
	
    }
}

