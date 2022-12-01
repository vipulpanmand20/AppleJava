package inheritanceParentChild;

public class PersonPatientDoctorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("_______________***Doctor Details***____________");
		Doctor d = new Doctor();
		d.setName("Akshay");
		d.setAge(33);
		d.setGender("Male");
		d.setContact("876543467");
		d.setId(11);
		d.setSpeciallization("nuro");
		d.setLisence("yes");
		d.display();
		/*
		 * System.out.println("_____________***Person Details***________________");
		 * Person p1=new Person(); p1.setName("Ramesh"); p1.setAge(22);
		 * p1.setGender("Male"); p1.setContact("9876543323"); p1.display();
		 */
		System.out.println("_____________***Patient Details***________________");
		Patient p = new Patient();
		p.setName("Rahul");
		p.setAge(25);
		p.setGender("male");
		p.setContact("987654345");
		p.setId(01);
		p.setBedno(2);
		p.setDisease("Tyfoid");
		p.display();

	}

}
