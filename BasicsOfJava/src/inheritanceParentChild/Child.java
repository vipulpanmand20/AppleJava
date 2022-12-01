package inheritanceParentChild;

public class Child extends Father1
{
	String fn2;
	
public void setFn2(String fn2) {
		this.fn2 = fn2;
	}
void display()

{
	super.display();
	System.out.println("Child Info:");
	System.out.println(fn2+" "+super.fn1+" "+Child.lastname);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
