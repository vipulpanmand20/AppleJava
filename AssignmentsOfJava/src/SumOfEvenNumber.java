import java.util.Scanner;
public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,num=100;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(i<num)
		{
			if(num%2==0)
			{
				System.out.println(num+"");
				num=i+2;
				
			}
		}

	}

}
