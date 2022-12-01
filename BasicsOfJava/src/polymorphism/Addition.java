package polymorphism;

public class Addition 
{
	void add(int a,int b)
	{
		System.out.println("Addition of 2 intger is:"+(a+b));
	}
	void add(String a,String b)
	{
		System.out.println("Addition of 2 String is:"+(a+b));
		
	}
	void add(int a,String b)
	{
		System.out.println("Addition of int and String is:"+(a+b));
	}
		public static void main(String[] args) {
	Addition a1=new Addition();
	a1.add(10, 20);
	a1.add(11, "abc");
	a1.add("abc", "def");
	}

}
