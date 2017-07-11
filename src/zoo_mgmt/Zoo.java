package zoo_mgmt;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Enclosure> enclosures;
  private ArrayList<Visitor> visitors;
  private int tickets;
  private double concession;
  private double price;
  private double cash;
  

  public Zoo(String name, int tickets, double concession, double price, double cash) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
    this.visitors = new ArrayList<Visitor>();
    this.tickets = tickets;
    this.concession = concession;
    this.price = price;
    this.cash = cash;
  }


//GETTERS
  public String getName() {
    return this.name;
  }
  
  public int getTickets() {
	  return this.tickets;
  }
  
  public double getConcession() {
	  return this.concession;
  }
  
  public double getPrice() {
	  return this.price;
  }
  
  public double getCash() {
	  return this.cash;
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

}
