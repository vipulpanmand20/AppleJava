package writtenpolymorpisminheritan;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address();
		a.setCity("Pune");
		a.setState("Maharastra");
		a.setCountry("India");
		
		Person p=new Person();
		p.setName("Ramesh");
		p.setGander("Male");
		p.setAge(22);
		p.setA(a);
		System.out.println("Name:"+p.getName()+"\nGander:"+p.getGander()+"\n Age:"+p.getAge()+" \n Address:"+a);
		

	}

}
