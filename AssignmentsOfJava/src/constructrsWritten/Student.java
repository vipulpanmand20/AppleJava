package constructrsWritten;

public class Student
{
	int id;
	String name,dept;
	Student(int i,String n,String d)
	{
		id=i;
		name=n;
		dept=d;
	}
	Student(Student s)
	{
		id=s.id;
		name=s.name;
		dept=s.dept;
	}
    void display()
    {
    	System.out.println(id+" "+name+" "+dept);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1=new Student(01,"Vipul","BCS");
       Student s2=new Student(s1);
       s1.display();
       s2.display();
	}

}
