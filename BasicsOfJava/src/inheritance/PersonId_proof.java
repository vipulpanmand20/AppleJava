package inheritance;

public class PersonId_proof {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Id_proof i=new Id_proof();
		i.setNumber(111);
		i.setName("ramesh");
		i.setAddress("pune");
       Person p= new Person();
       p.setAge(22);
       p.setContact(98654332);
       p.setName("ramesh");
       p.setI(i);
       System.out.println("Age:"+p.getAge()+"\nContact:"+p.getContact()+"\nName:"+p.getName()+"\nIdproof:"+p.getI());
      
       
       
	}

}
