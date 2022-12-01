package constructrsWritten;

public class EmployeeDetails
{    
	int id, salary;  
	String name, address, dept;  
	  
	//Getter and setters  
	public int getId() 
	{  
	    return id;  
	}  
	public void setId(int id) 
	{  
	    this.id = id;  
	}  
	public int getSalary() 
	{  
	    return salary;  
	}  
	public void setSalary(int salary)
	{  
	    this.salary = salary;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) 
	{  
	    this.name = name;  
	}  
	public String getAddress() {  
	    return address;  
	}  
	public void setAddress(String address) {  
	    this.address = address;  
	}  
	public String getDept() {  
	    return dept;  
	}  
	public void setDepartment(String dept) {  
	    this.dept = dept;  
	}
	void display()
	{
		System.out.println(id+" "+salary+" "+name+" "+address+" "+dept+" "+address);
	}
	public String toString()
	{  
	    return id+" " +salary+","+name+" "+address+" "+dept+" "+address;  
	 }  

	    public static void main(String args[])
	    { 
	        EmployeeDetails ed = new EmployeeDetails();   
	        ed.setId(5);  
	        ed.setName("Vipul");  
	        ed.setDepartment("IT");  
	        ed.setSalary(15000);  
	        ed.setAddress("Pune");   
	        System.out.println(ed);
	        System.out.println(ed.getId()+" "+ed.salary+" "+ed.getName()+" "+ed.getDept()+" "+ed.getAddress());

	    }
	}
