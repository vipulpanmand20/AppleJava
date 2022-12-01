package classandobject;

import java.util.Scanner;

public class SimpleIntersrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		float p= sc.nextInt();
		float r= sc.nextInt();
		float t= sc.nextInt();		
		SimpleIntersrt c1 = new SimpleIntersrt();
		c1.intersrt(p,r,t);
	}
	void intersrt(float p,float r,float t)
	{
		System.out.println("Simple Intersrt:"+(p*r*t)/100);
	
    }
}