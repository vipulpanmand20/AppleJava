package classandobject;
import java.util.Scanner;
 class Stud {
 int id;
 String name;
 String dept;
 int marks;
 void setData(int i,String n,String d,int m)
 {
	 id=i;
	 name=n;
	 dept=d;
	 marks=m;
 }
	 void display()
	 {
		 //System.out.println(id+" "+name+" "+dept+" "+marks);
	 System.out.println("in display method");
	 }
     public String toString()
     {
		return id+" "+name+" "+dept+" "+marks;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stud s=new Stud();
       s.setData(101,"Vipul","bcs",70);
       System.out.println(s);
       s.display();
       
    
	}

}
