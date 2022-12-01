package inheritanceParentChild;

public class Person {
	String name, contact, gender;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	void display()
	{
		
		System.out.println("name:" +name + "\nContact:" +contact + "\n Age:" +age+"\nGander:"+gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
