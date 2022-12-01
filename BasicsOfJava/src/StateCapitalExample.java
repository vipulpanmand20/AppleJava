import java.util.Scanner;

public class StateCapitalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a State name");
		sname = sc.next(); // one word input
		sname = sc.nextLine();/// can take a complete line as input
		switch(sname) {
		case "Maharastra":
			System.out.println("Capital is Mumbai");
			break;
		case "Goa":
			System.out.println("Capital is Panaji");
			break;
		case "Gujarat":
			System.out.println("Capital is Gandinagar");
			break;
		case "Madhya Pradesh":
			System.out.println("Capital is Bopal");
			break;
		case "Karnataka":
			System.out.println("Capital is Bangalore");
			break;
		default:
			System.out.println("Enter Valid input");

		}
	}

}
