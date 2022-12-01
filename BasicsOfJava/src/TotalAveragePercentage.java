
public class TotalAveragePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 40.2f, f2 = 30.1f, f3 = 30.3f, f4 = 43.2f, f5 = 42.9f, total, average, percentage;
		total = f1 + f2 + f3 + f4 + f5;
		average = (total / 5);
		percentage = (total / 250) * 100;
		System.out.println("total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Percentage:" + percentage);
	}

}
