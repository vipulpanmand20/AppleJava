package inheritance;

public class CollegeCon 
{
	int code;
   String name,address;
	
	DepartmentCon dept;//reference objects
	LibraryCon lib;
	
    CollegeCon(int code,String name,String address,DepartmentCon dept,LibraryCon lib)
    {
    	this.code=code;
    	this.name=name;
    	this.address=address;
    	this.dept=dept;
    	this.lib=lib;	
    }
	public String toString()
	{
		return +code+" "+name+" "+address+" "+dept+" "+lib;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
