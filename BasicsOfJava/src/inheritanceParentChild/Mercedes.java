package inheritanceParentChild;

public class Mercedes extends Car1 
{
	void dashboard()
	{
		//super.dashboard();
		System.out.println("Screen");
		super.dashboard();    //will always represent immediate parent class
	}
    void enginePower()
    {
    	System.out.println("Mercedes:11906 cc");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
