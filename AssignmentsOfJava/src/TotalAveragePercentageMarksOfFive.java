import java.util.Scanner;

public class TotalAveragePercentageMarksOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks of five subjects:\n");
		float Physics = sc.nextFloat();
		float Chemistry = sc.nextFloat();
		float Biology = sc.nextFloat();
		float English = sc.nextFloat();
		float Marathi = sc.nextFloat();

		float total;
		float average;
		float percentage;
		char grade;
		total = Physics + Chemistry + Biology + English + Marathi;
		average = (float) (total / 5.0);
		percentage = (float) (total / 500) * 100;
		if (average >= 90)
			grade = 'A';
		else if (average >= 70 && average < 90)
			grade = 'B';
		else if (average >= 60 && average < 70)
			grade = 'C';
		else if (average >= 70 && average < 60)
			grade = 'D';
		else
			grade = 'E';

		// It will produce the final output
		System.out.println("The Total marks   = " + total);
		System.out.println("The Average marks = " + average);
		System.out.println("The Percentage    = " + percentage);
		System.out.println("The Grade         = '" + grade);
		sc.close();
	}

}
