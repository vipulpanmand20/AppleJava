 package forlooping;

public class ArmstrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153, cnt=0, sum=0;
		int temp=num;
		while(temp!= 0)
		{
			cnt++;
			temp = temp / 10;
		}
		// System.out.println(cnt);
		int temp1 = num;
		// int power=1;
		while (temp1!= 0)
		{
			int power = 1;
			int r= temp1%10;
			for (int i = 1; i<=cnt;i++) 
			{
				power = power * r;
			}
			sum = sum + power;
			temp1 = temp1 / 10;

		}
		if (sum == num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Aramstrong number");
	}

}
