package inheritance;

public class LibraryCon 
{
	private int notebooks;
	private String incharge;
	
	LibraryCon(int notebooks,String incharge)
	{
		this.notebooks=notebooks;
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
