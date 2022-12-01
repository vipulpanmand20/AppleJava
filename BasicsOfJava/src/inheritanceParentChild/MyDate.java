package inheritanceParentChild;

public class MyDate 
{
	int dd,mm,yy;
	static String month="November";
	private void display()
	{
		System.out.println("In display method");
		
	}
    public int getDd() {
		return dd;
	}
    public void setDd(int dd) {
		this.dd = dd;
	}
    public int getMm() {
		return mm;
	}



	public void setMm(int mm) {
		this.mm = mm;
	}



	public int getYy() {
		return yy;
	}



	public void setYy(int yy) {
		this.yy = yy;
	}



	public static String getMonth() {
		return month;
	}



	public static void setMonth(String month) {
		MyDate.month = month;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
