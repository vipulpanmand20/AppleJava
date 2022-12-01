package dynamicmethoddispatch;

public class Fruit
{
	void taste()
	{
		System.out.println("Fruit are generally sweet in taste");
	}
}
class Apple extends Fruit
{
	void taste()
	{
		System.out.println("Apple are sweet to taste");
	}
}
class Strawberry extends Fruit
{
	void taste()
	{
		System.out.println("Strawberries are sweet and sour in taste");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
