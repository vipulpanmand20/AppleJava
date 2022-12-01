package inheritance;

public class PersonCon 
{
	private int id,contact;
	private String name,address,email;
	AddressCon a;
	
	
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressCon getA() {
		return a;
	}

	public void setA(AddressCon a) {
		this.a = a;
	}
	public String toString()
	{
		return +id+" "+contact+" "+name+" "+address+" "+email+" "+a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
