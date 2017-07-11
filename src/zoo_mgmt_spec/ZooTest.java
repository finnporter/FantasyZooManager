package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.Zoo;
import zoo_mgmt.enclosures.ForrestEnc;

public class ZooTest {
  Zoo zoo;
  ForrestEnc forrestEnc;

  @Before
  public void before() {
    zoo = new Zoo("Finn's Fantastical Fauna", 100, 0.5, 15.0, 2000.0);
    forrestEnc = new ForrestEnc("Forbidden Forrest", true, 50000);
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
  
  @Test void hasPrice() {
	  assertEquals(15.0, zoo.getPrice(), 0.01);
  }
  
  @Test void hasCash() {
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

}