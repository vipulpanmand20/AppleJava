import java.util.Scanner;

public class CovertDaysIntoYearWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month, year, week, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		month = sc.nextInt();
		year = month / 365;
		month = month % 365;
		System.out.println("No.of Years:" + year);
		week = month / 7;
		System.out.println("No.of Week:" + week);
		day = month;
		System.out.println("no.of days:" + day);
		sc.close();

	}

}
