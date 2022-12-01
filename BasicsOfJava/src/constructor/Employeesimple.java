package constructor;
import java.util.Scanner;
public class Employeesimple {
	int id,salary;
	String name,dept;
	float pf;
	Employeesimple()
	{
	id=1;
	name="Vipul";
	dept="aaaaa";
	pf=1;
	}
void display()
{
	System.out.println(id+" "+name+" "+dept+" "+salary+" "+pf);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Employeesimple e=new Employeesimple();
e.display();
System.out.println("---------------------");
Employeesimple e2=new Employeesimple();
e2.display();

	}

}
