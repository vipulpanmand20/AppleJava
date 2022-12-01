package inheritanceParentChild;

public class GrandFatherChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GrandFather gf=new GrandFather();
      Father1 f1=new Father1();
      Child c=new Child();
      c.setFirstname("Baburao");
      c.setMiddlename("Ramrao");
      c.setFn1("kisan");
      c.setFn2("sonu");
      c.display();
	}

}
