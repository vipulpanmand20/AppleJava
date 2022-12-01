package classandobject;

public class Shopping
{
	String purchaseitemname;
	int priceperitem;
	int quantity;
	int bill;

	void accepctDetails(String piteamname, int price, int quantity) 
	{
		purchaseitemname = piteamname;
		priceperitem = price;
		quantity = quantity;

	}

	void calculateBill()
	{
		bill = quantity * priceperitem;
	}

	void display() 
	{
		if(quantity  > 0)
		{
		System.out.println("item name:" + purchaseitemname + "\nprice:" + priceperitem + "\n quantity:" + quantity+"\n Total Bill:"+bill);
		}
		else
		{
		
		System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s = new Shopping();
		s.accepctDetails("laptop", 55000, 0);
		s.calculateBill();
		s.display();

	}

}
