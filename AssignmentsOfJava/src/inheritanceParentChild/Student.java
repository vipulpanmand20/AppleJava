package inheritanceParentChild;

public class Student extends Person
{
	static String college="MIT college";
	float percent;
	
	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	void Grade(float percent)
	{
		if(percent>85){
			System.out.println("Grade A");
		}
		else if(percent<=85 && percent>65)
		{
			System.out.println("Grade B");
		}
		else if(percent<=65 && percent>45)
		{
			System.out.println("Grade c");
		}
		else if(percent<=65 && percent>35)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Falied!!!");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
