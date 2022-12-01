package inheritance;

public class Person 
{
	int age,contact;
	String name;
	Id_proof i;
	
	public int getAge() 
	{
		return age;
	}
public void setAge(int age) 
{
		this.age = age;
	}
public int getContact()
{
		return contact;
}
public void setContact(int contact) 
{
		this.contact = contact;
	}
public String getName() {
		return name;
	}
 public void setName(String name) {
		this.name = name;
	}
public Id_proof getI() {
		return i;
	}
public void setI(Id_proof i) {
		this.i= i;
	}
public String toString()
{
	return age+" "+contact+" "+name+" "+i;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
