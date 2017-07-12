package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.*;
import zoo_mgmt.enclosures.*;

public class ZooTest {
  Zoo zoo;
  ForrestEnc forrestEnc;
  Visitor visitor1;
  Visitor visitor2;

  @Before
  public void before() {
    zoo = new Zoo("Finn's Fantastical Fauna", 100, 15.0, 2000.0);
    forrestEnc = new ForrestEnc("Forbidden Forrest", true, 50000);
    visitor1 = new Visitor("Hawkeye Pierce", 200.0, 36);	
    visitor2 = new Visitor("BJ Honeycutt", 150.0, 4);
  }

  @Test
  public void hasName() {
    assertEquals("Finn's Fantastical Fauna", zoo.getName());
  }
  
  @Test
  public void hastickets() {
	  assertEquals(100, zoo.getTickets());
  }
  
  @Test
  public void hasPrice() {
	  assertEquals(15.0, zoo.getPrice(), 0.01);
  }
  
  @Test
  public void hasZooCash() {
	  assertEquals(2000.0, zoo.getZooCash(), 0.01);
  }

  @Test
  public void enclosuresStartsEmpty() {
    assertEquals(0, zoo.enclosureCount());
  }

  @Test
  public void canAddEnclosure() {
    zoo.addEnclosure(forrestEnc);
    assertEquals(1, zoo.enclosureCount());
  }

  @Test
  public void canRemoveEnclosure() {
    zoo.addEnclosure(forrestEnc);
    zoo.removeEnclosure(forrestEnc);
    assertEquals(0, zoo.enclosureCount());
  }
  
  @Test
  public void startsWithNoVisitors() {
	  assertEquals(0, zoo.visitorCount());
  }
  
  @Test
  public void canAddVisitors() {
	  zoo.addVisitor(visitor1);
	  assertEquals(1, zoo.visitorCount());
  }
  
  @Test
  public void canRemoveVisitors() {
	  zoo.addVisitor(visitor1);
	  zoo.removeVisitor(visitor1);
	  assertEquals(0, zoo.visitorCount());
  }
  
  @Test
  public void canBuyTicket() {
	  assertEquals(185.0, zoo.buyTicket(visitor1), 0.01);
  }
  
  @Test
  public void canBuyConcessionTicket() {
	  assertEquals(138.75, zoo.buyTicket(visitor2), 0.01);
  }

}