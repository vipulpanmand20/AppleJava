package writtenpolymorpisminheritan;

public class Series 
{
	double series(double n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double term=1.0/ i;
			sum=sum+term;
		}
		return sum;
			
		}
	double series(double a,double n)
	{
		double sum=0;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			double term=x/Math.pow(a,n);
			sum=sum+term;
			x=x+3;
			
		}
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series s=new Series();
		System.out.println("sum of series1:"+s.series(8));
		System.out.println("sum of series2:"+s.series(4, 8));

	}

}
