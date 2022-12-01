import java.util.Scanner;

public class PrintLeapYear
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number");
		System.out.println("Enter Year");
		num = sc.nextInt();
		year = sc.nextInt();
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
			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
				System.out.println("29 Days in this Months");
			else
				System.out.println("28 Days in this Months");
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
