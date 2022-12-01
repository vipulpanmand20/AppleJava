package encapsulation;

class Account 
{
	private int id,accno,balance;

	// public getters setters
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		
		return id;

	}

	public void setAccno(int accno) {
		this.accno =accno;
	}

	public int getAccno() {
		return accno;

	}

	public void setBalance(float accbal) {
		this.balance =(int) accbal;
	}

	public int getBalance() 
	{
		return balance;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}


}

	