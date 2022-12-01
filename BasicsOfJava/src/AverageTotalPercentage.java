import java.util.Scanner;

public class AverageTotalPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float s1, s2, s3;
		double total, average, percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three subject marks: ");
		System.out.println("enter the s1 subject marks: ");
		s1 = sc.nextFloat();
		System.out.println("enter the s2 subject marks: ");
		s2 = sc.nextFloat();
		System.out.println("enter the s3 subject marks: ");
		s3 = sc.nextFloat();
		total = s1 + s2 + s3;
		average = (total / 3);
		percentage = (total / 300) * 100;
		System.out.println("total marks:"+total);
		System.out.println("average marks:"+average);
		System.out.println("percentage:"+percentage);
		sc.close();
	}

}
