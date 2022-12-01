package forlooping;
import java.util.Scanner;

public class PowerFactExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2, power = 3, pp= 1;
		for (int i = 1; i<=power;i++) {
			pp = pp * base;

		}

		System.out.println("answer is:" + pp);
	}

}
