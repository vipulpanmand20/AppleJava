package inheritanceParentChild;

public class FatherSonDaugtherMain
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Son s= new Son();
    s.setName("Ramesh");
    s.setAge(25);
    System.out.println("Son Information:");
    System.out.println(s.getName()+" "+Son.Surname+" "+s.age);
    s.education();
    s.address();
    
	}

}
