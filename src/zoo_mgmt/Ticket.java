package zoo_mgmt;

public class Ticket {
	private int price;
	private boolean concession;
	
	public Ticket(int price, boolean concession) {
		this.price = price;
		this.concession = concession;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public boolean getConcession() {
		return this.concession;
	}

}
