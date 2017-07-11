package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.*;
import zoo_mgmt.enclosures.*;

public class ZooTest {
  Zoo zoo;
  ForrestEnc forrestEnc;
  Visitor visitor;

  @Before
  public void before() {
    zoo = new Zoo("Finn's Fantastical Fauna", 100, 0.5, 15.0, 2000.0);
    forrestEnc = new ForrestEnc("Forbidden Forrest", true, 50000);
    visitor = new Visitor("Hawkeye Pierce", 200, 36);	
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
  public void hasConcession() {
	  assertEquals(0.5, zoo.getConcession(), 0.01);
  }
  
  @Test
  public void hasPrice() {
	  assertEquals(15.0, zoo.getPrice(), 0.01);
  }
  
  @Test
  public void hasCash() {
	  assertEquals(2000.0, zoo.getCash(), 0.01);
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
	  zoo.addVisitor(visitor);
	  assertEquals(1, zoo.visitorCount());
  }
  
  @Test
  public void canRemoveVisitors() {
	  zoo.addVisitor(visitor);
	  zoo.removeVisitor(visitor);
	  assertEquals(0, zoo.visitorCount());
  }

}