package dynamicmethoddispatch;

public class DynamicMethoddispatch 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Fruit f= new Fruit();
    f.taste();
    f=new Apple();
    f.taste();
    f=new Strawberry();
    f.taste();
	}

}
