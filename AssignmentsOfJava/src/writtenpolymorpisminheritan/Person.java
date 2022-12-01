package writtenpolymorpisminheritan;

public class Person 
{
	private String name,gander;
	private int age;
	Address a;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGander() {
		return gander;
	}


	public void setGander(String gander) {
		gander=gander;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getA() {
		return a;
	}


	public void setA(Address a) {
		this.a = a;
	}
   public String toString()
   { return name+" "+gander+" "+age+" "+a;
		    
   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
