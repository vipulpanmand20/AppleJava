package constructor;

public class PuneCollege 
{
	int id,dno,studno;
	String name,location;
	static String uniname="Pune University";  //class variable
	static String state="Maharastra";
	PuneCollege()
	{
		id=101;
		dno=01;
		name="Modern College";
		location="Ganesh Khind";
		}
	PuneCollege(int i,int dn,String n,String l)
	{
		id=i;
		dno=dn;
		name=n;
		location=l;
	}
	void display()
	{
		System.out.println(id+" "+dno+" "+name+" "+location);
	}
	public String toString()
	{
		return id+" "+dno+" "+name+" "+location;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PuneCollege c1=new PuneCollege();
      c1.display();
      PuneCollege c2=new PuneCollege(102,02,"MIT College","Alandi");
      System.out.println("--------------------------------");
      c2.display();
      PuneCollege c3=new PuneCollege(103,03,"MIT College","Akurdi");
      System.out.println("--------------------------------");
      c3.display();
     // System.out.println(c1.id+" "+c1.name);
      //System.out.println(c1.uniname+" "+c1.state);
     
	}

}
