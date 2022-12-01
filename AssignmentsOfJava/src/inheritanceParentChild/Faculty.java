package inheritanceParentChild;

public class Faculty extends Person
{
	String subject;
	float salary,pfcalculate;
	

	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public float getPfcalculate() {
		return pfcalculate;
	}


	public void setPfcalculate(float pfcalculate) {
		this.pfcalculate = pfcalculate;
	}
	void pfCalsulator(float salary)
	{
		float pf=salary*0.15f;
		System.out.println("Calculated pf is:"+pf);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
