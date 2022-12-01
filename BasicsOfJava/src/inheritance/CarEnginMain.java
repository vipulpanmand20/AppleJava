package inheritance;
import java.util.Scanner;
public class CarEnginMain
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Engine e1=new Engine();
     e1.setRpm("1000 rpm");
     e1.setCylinder(4);
     e1.setTorque(89);
     e1.setCompaney("Tata");
     Car c1=new Car();
     c1.setId(1001);
     c1.setName("Zest");
     c1.setPrice(950000);
     c1.setColor("Blue");
     c1.setE(e1);
     System.out.println("Information of car:");
     System.out.println("Name:"+c1.getName()+"\nprice:"+c1.getPrice()+"\nColor:"+c1.getColour());
     System.out.println("Engine:"+c1.getE());
  
	}

}
