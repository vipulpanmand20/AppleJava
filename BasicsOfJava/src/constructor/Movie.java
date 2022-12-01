package constructor;
import java.util.Scanner;
public class Movie 
{
	int id,releaseyear;
	String name, producername,bugget;
	Movie()
	{
		id=101;
		releaseyear=2022;
		name="Brahmastra";
		producername="Karan johar";
		bugget="4100000000";
		
		
	}
	Movie(int i,int r,String n,String p,String b)
	{
		id=i;
		releaseyear=r;
		name=n;
		producername=p;
		bugget=b;
		
	}
	void display()
	{
		System.out.println(id+" "+releaseyear+" "+name+" "+producername+" "+bugget);
	}
	public String toString()
	{
		return id+" "+releaseyear+" "+name+" "+producername+" "+bugget;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Movie m=new Movie();
        m.display();
		
     
	}

}
