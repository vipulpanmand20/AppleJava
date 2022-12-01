import java.util.Scanner;
public class HotelManagementSwitchCase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int ch,quantity,price;
long total;
Scanner sc = new Scanner(System.in);
System.out.println("\n MENU CARD \nSelect your Thali\n1.Rajasthani Thali\n2.Bengali Vegarian\n3.Gujarathi Kathiawadi\n4.punjabi Thali \n5.Maharashtra Thali\n");
ch= sc.nextInt();

switch(ch){
case 1:
	System.out.println("\n You have Selected Rajasthani Thali \n.enter the quantity");
	quantity=sc.nextInt();
	price=300;
	System.out.println("\n Total cost:"+price*quantity);
	break;
case 2:
	System.out.println("\n You have Selected Bengali Vegarian Thali \n.enter the quantity");
	quantity=sc.nextInt();
	price=300;
	System.out.println("\n Total cost:"+price*quantity);
	break;
case 3:
	System.out.println("\n You have Selected Gujarathi Kathiawadi Thali \n.enter the quantity");
	quantity=sc.nextInt();
	price=100;
	System.out.println("\n Total cost:"+price*quantity);
	break;
case 4:
	System.out.println("\n You have Selected punjabi Thali \n.enter the quantity");
	quantity=sc.nextInt();
	price=350;
	System.out.println("\n Total cost:"+price*quantity);
	break;
case 5:
	System.out.println("\n You have Selected Maharastrian Thali \n.enter the quantity");
	quantity=sc.nextInt();
	price=250;
	System.out.println("\n Total cost:"+price*quantity);
	break;
	default:
		System.out.println("Sorry Unavailable this Thali");
	}
	}
}