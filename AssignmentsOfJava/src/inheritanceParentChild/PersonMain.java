package inheritanceParentChild;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student();
    s1.setId(101);
    s1.setAge(23);
    s1.setContact("987654321");
    s1.setPercent(70);
    System.out.println(s1.getId()+" "+s1.getAge()+" "+s1.getContact()+" "+s1.getPercent());
    s1.Grade(70);
    System.out.println("  ");
    System.out.println("Facilty Information:");
    Faculty f=new Faculty();
    f.setId(111);
    f.setAge(23);
    f.setContact("987654321");
    f.setSubject("java");
    f.setSalary(22222);
    System.out.println(f.getId()+" "+f.getAge()+" "+f.getContact()+" "+f.getContact()+" "+f.getSubject()+" "+f.getSalary() );
	}

}
