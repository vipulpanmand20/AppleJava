import java.util.Scanner;

public class PrintNumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number");
		num = sc.nextInt();
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days in this Month");
			break;
		case 2:
			System.out.println("28/29 Days in this Months");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days in this Month");
			break;
			default:
				System.out.println("enter Valid Number");
				sc.close();

		}

	}

}
