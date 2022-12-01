package constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee();
    e1.setId(101);
    e1.setName("Vipul");
    e1.setDept("Development");
    e1.setContact("number");
    System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getdept()+" "+e1.getContact());
	}

}
