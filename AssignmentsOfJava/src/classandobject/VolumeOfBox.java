package classandobject;

import java.util.Scanner;

public class VolumeOfBox 
{
	int l,w,h,volume;
	void volume() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		l = sc.nextInt();
		System.out.println("enter width:");
		w = sc.nextInt();
		System.out.println("enter height:");
		h = sc.nextInt();
		volume=l*w*h;
		System.out.println("Volume of the box is:" +volume);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		VolumeOfBox b1 = new VolumeOfBox();
		b1.volume();
	}
}
