package encapsulation;
import java.util.Scanner;
public class GooglePay
{
	void withdraw(int amount,Account acc)//passing object as parameter
	{
		int accbal=acc.getBalance();//50000
		if(accbal>amount)//50000>10000
		{
			accbal=accbal-amount;//accbal=50000-10000
			acc.setBalance(accbal);
		}
		else
			System.out.println("Low Balance!!! Try after some time...");
	}
	void deposite(int depositamt,Account acc)
	{
		float accbal=acc.getBalance();
		accbal=accbal+depositamt;
		acc.setBalance(accbal);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account a1=new Account();
		 a1.setId(101);
		 a1.setAccno(9999);
		 a1.setBalance(50000);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the amount to withdraw:");
	     int amt=sc.nextInt();
	     GooglePay gp=new GooglePay();
	     gp.withdraw(amt, a1);//10000
	     System.out.println("Amount withdrawn;TotalBalance:"+a1.getBalance());
	     Account a2=new Account();
	     System.out.println("Enter the amount to be deposited:");
	     int dep=sc.nextInt();
	    GooglePay gp1=new GooglePay();
	    gp1.deposite(dep, a1);
	    System.out.println("Amount deposited Total Balance is :"+a1.getBalance());
	     

	}

}
