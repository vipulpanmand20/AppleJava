package inheritanceParentChild;
//           child    
public class MyTime extends MyDate
{
	int hrs,mins,secs;
   public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	public int getMins() {
		return mins;
	}


	public void setMins(int mins) {
		this.mins = mins;
	}


	public int getSecs() {
		return secs;
	}


	public void setSecs(int secs) {
		this.secs = secs;
	}
void displayDateTime()
{
	System.out.println(dd+"/:"+mm+"/:"+yy);
	System.out.println(hrs+":"+mins+":"+secs);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
