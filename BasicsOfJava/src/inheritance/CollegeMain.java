package inheritance;

public class CollegeMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Department d1=new Department();
     d1.setId(1000);
     d1.setName("Computer");
     Library l1=new Library();
     l1.setNotebooks(1000);
     l1.setIncharge();
     
     
     College c1=new College();
     c1.setCode(54321);
     c1.setName("Mr.Akash");
     c1.setAddress("Dy Patil");
     c1.setDept(d1);
     System.out.println("id:"+d1.getId()+"\n/Name:"+d1.getName());
     System.out.println("Notebook:"+l1.getNotebooks()+"\n Incharge:"+l1.getIncharge());
     System.out.println("setcode:"+c1.getCode()+"\nName:"+c1.getName()+"\n Address:"+c1.getAddress()+"\n dept:"+
     Dept());
     
     
     
	}

	private static String Dept() {
		// TODO Auto-generated method stub
		return null;
	}

}
