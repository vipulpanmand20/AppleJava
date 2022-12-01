package inheritanceParentChild;

public class Car {
	String price,engine;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	void wheelno()
	{
		System.out.println("4 wheels");
	}
    void hedlights()
    {
    	System.out.println("2 headlihts");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
