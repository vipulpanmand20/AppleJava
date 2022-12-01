import java.util.Scanner;

public class IfElseIfExampleVovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("enter a character:");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if (ch == 'A' || ch == 'a')
			System.out.println("Vovel");
		else if (ch == 'E' || ch == 'e')
			System.out.println("Vovel");
		else if (ch == 'I' || ch == 'i')
			System.out.println("Vovel");
		else if (ch == 'U' || ch == 'u')
			System.out.println("Vovel");
		else
			System.out.println("Conconet");
		System.out.println("enter Vovel Character");
	}
}