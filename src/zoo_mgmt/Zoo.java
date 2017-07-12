package zoo_mgmt;
import java.util.ArrayList;

public class Zoo {
	private String name;
	private ArrayList<Enclosure> enclosures;
	private ArrayList<Visitor> visitors;
	private int tickets;
	private double price;
	private double zooCash;


	public Zoo(String name, int tickets, double price, double zooCash) {
		this.name = name;
		this.enclosures = new ArrayList<Enclosure>();
		this.visitors = new ArrayList<Visitor>();
		this.tickets = tickets;
		this.price = price;
		this.zooCash = zooCash;
	}


//GETTERS
	public String getName() {
		return this.name;
	}

	public int getTickets() {
		return this.tickets;
	}

	public double getPrice() {
		return this.price;
	}

	public double getZooCash() {
		return this.zooCash;
	}

//OTHER ZOO FUNCTIONS
	public int enclosureCount() {
		return this.enclosures.size();
	}

	public void addEnclosure(Enclosure enclosure) {
		this.enclosures.add(enclosure);
	}

	public void removeEnclosure(Enclosure enclosure) {
		this.enclosures.remove(enclosure);
	}

	public int visitorCount() {
		return this.visitors.size();	  
	}

	public void addVisitor(Visitor visitor) {
		this.visitors.add(visitor);
	}

	public void removeVisitor(Visitor visitor) {
		this.visitors.remove(visitor);
	}

	public double buyTicket(Visitor visitor) {
		if (visitor.getAge() <= 10 || visitor.getAge() >= 65) {
			double amount = this.price * 0.75;
			double newPrice = visitor.getCash() - amount;
			return newPrice;
		}
		else {
			double result = visitor.getCash() - this.price;
			return result;
		}
	}
}
