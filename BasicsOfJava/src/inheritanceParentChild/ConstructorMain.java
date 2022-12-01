package inheritanceParentChild;
	class A
	{
		A()
		{
		System.out.println("Inside class A constructor");
		
	}
}
class B extends A
{
	B()
	{
		System.out.println("inside class B Prameterized constructor");
	}
}
class C extends B
{
	C()
	{
		super();//imediate parent class B class
		System.out.println("inside class c constructor");
	}
}
   public class ConstructorMain
   {
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent class default constructor
       C c1=new C();  //Parent class defalut constructor is called first
       
	}

}
