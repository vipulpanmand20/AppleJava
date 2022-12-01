package whilelooping;

public class AdditionOfDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 345, sum = 0,product=1,cnt=0; //num%10 345%10
		while (num != 0) {       //num=345   num=34    num=3
			int r = num % 10;    //  r=345%10=5   r=34%10=4   r=3%10=3
			sum = sum + r;      
			product=product*r;
			cnt++;
			num = num / 10;
		}
		System.out.println("addition is:" + sum);
		System.out.println("multiplaction is:" +product);
		System.out.println("cnt is:" + cnt);
	}

}
