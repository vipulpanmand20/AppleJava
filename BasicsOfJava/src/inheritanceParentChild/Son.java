package inheritanceParentChild;

public class Son extends Father 
{
	String name;
	int age;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age =age ;
	}
	void education()
	{
		System.out.println("Son is enginner");
	}
	void address()
	{
		System.out.println("Staying at pune.!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
