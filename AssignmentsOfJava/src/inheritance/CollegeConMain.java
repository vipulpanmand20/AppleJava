package inheritance;

public class CollegeConMain 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryCon lib=new LibraryCon(2000,"abc");
		DepartmentCon dept=new DepartmentCon(01,"Computer");
		CollegeCon cc1=new CollegeCon(01,"Vipul","Junnar",dept,lib);
		System.out.println(cc1);
		
	}

}
