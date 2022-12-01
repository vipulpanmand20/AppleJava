package inheritanceParentChild;

public class GrandFather {
	String firstname, middlename;
	static String lastname = "Lamkhade";

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	void display() {
		System.out.println("Grandfather Info:");
		System.out.println(firstname + " " + middlename + " " + lastname);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
