package constructor;

public class StaticBlockExample
{
	int a;
	static int count;
	//executed before main method,use to initialize only static variable
	static
	{
		//a=10;
		count++;
		System.out.println("In Static Blocks 1");
	}
	static
	{
		count++;
		System.out.println("In Static Blocks 2");
	}
	static
	{
		count++;
		System.out.println("In Static Blocks 3");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StaticBlockExample.count);
	}

}
