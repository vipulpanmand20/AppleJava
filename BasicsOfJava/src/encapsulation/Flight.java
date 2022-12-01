package encapsulation;

import constructor.Employee;

public class Flight {
	private int id, ticketRate;
	private String companey, source, destination;

	// public getters setters
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;

	}

	public void setTicketRate(int ticketRate) {
		this.ticketRate = ticketRate;
	}

	public int getticketRate() {
		return ticketRate;

	}

	public void setCompaney(String companey) {
		this.companey = companey;
	}

	public String getCompaney() {
		return companey;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getsource() {
		return source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getdestination() {
		return destination;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f1 = new Flight();
		f1.setId(101);
		f1.setTicketRate(800);
		f1.setCompaney("cmss");
		f1.setSource("It");
		System.out.println(f1.getId() + " " + f1.getticketRate() + " " + f1.getCompaney() + " " + f1.getsource());
	}

}
