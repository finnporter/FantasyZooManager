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
    zoo = new Zoo("Finn's Fantastical Fauna");
    forrestEnc = new ForrestEnc("Forbidden Forrest", true, 50000);
  }

  @Test
  public void hasName() {
    assertEquals("Finn's Fantastical Fauna", zoo.getName());
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