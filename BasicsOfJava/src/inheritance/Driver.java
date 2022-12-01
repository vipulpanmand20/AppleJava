package inheritance;

public class Driver 
{
	int did;
	String dname,contact;
	

	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getContact() {
		return contact;
	}


	public void setcontact(String contact) {
		this.contact = contact;
	}
	public String toString()
	{
		return +did+" "+dname+" "+contact;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
