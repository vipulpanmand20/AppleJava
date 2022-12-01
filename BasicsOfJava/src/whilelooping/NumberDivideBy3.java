package whilelooping;

public class NumberDivideBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, num = 100;
		
		while (i < num)
		{
			if (i % 3 == 0) 
			{
				System.out.println(i + "");
				i++;
			}
		}

	}

}
