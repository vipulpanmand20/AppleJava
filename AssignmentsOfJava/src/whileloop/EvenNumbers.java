package whileloop;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 229, i = 121;
		System.out.println("List even number from 121 to 229:");
		while (i <= num) {
			if (i % 2 == 0) {
				System.out.println(i + "");
			}
			i++;
		}
	}

}
