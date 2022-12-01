package whilelooping;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=51,i=2;
			//boolean flag=true;
			int mid=num/2;
			
			while(i<=mid)
			{
			if(num % i==0)
			{
				//System.out.println("Not prime");
			  //flag =false;
				break;
			}
			i++;
			}
			if(i>mid)
			{
			System.out.println("Prime");
			}
			else
				System.out.println("Not Prime");
				
				
			}
		}



