package writtenpolymorpisminheritan;

public class Student 
{
	int roll_no;
	String name;
	Department d;
	Student(int roll_no,String name,Department d)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.d=d;
		
	}
	public String toString()
	{
		return +roll_no+" "+name+" "+d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
