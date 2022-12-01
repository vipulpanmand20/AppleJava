package inheritanceParentChild;

public class Doctor extends Person 
{
	int id;
	String speciallization,lisence;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSpeciallization() {
		return speciallization;
	}


	public void setSpeciallization(String speciallization) {
		this.speciallization = speciallization;
	}


	public String getLisence() {
		return lisence;
	}


	public void setLisence(String lisence) {
		this.lisence = lisence;
	}
	void display()
	{
		super.display();
		System.out.println("Id:" +id + "\nSpeciallization:" +speciallization+ "\nLisence:" +lisence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
