package inheritanceParentChild;

public class Father1 extends GrandFather 
{
	String fn1;
	public String getFn1() {
		return fn1;
	}

	public void setFn1(String fn1) {
		this.fn1 = fn1;
	}
	void display()
	{
		super.display();
		System.out.println("Father Info:");
		System.out.println(fn1+" "+super.firstname+" "+Father1.lastname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
