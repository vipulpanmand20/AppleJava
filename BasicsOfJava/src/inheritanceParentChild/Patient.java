package inheritanceParentChild;

public class Patient extends Person {
	int id, bedno;
	String disease;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBedno() {
		return bedno;
	}

	public void setBedno(int bedno) {
		this.bedno = bedno;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	void display()
	{
		super.display();
		System.out.println("Id:" +id + "\nbedno:" + bedno + "\nDisease:" +disease);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
