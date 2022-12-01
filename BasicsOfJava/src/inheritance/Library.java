package inheritance;

public class Library
{
	private int notebooks;
	private String incharge;
	public int getNotebooks()
	{
	return notebooks;
	}
	public void setNotebooks(int notebooks)
	{
		this.notebooks=notebooks;
		
	}
	public String getIncharge()
	{
		return incharge;
	}
	public void setIncharge()
	{
		this.incharge=incharge;
		
	}
	public String toString()
	{
		return +notebooks+" "+incharge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
