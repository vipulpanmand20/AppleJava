package forlooping;

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1, a = 6; i <= n || a > 0; i++, a--) // i=1 i=2 i=3
		{
			System.out.print(i + " ");
			// i++;
			System.out.print(a + " ");
		}
		System.out.print ("Done");
	}

}
