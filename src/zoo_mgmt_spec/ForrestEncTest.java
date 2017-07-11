package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.DragonType;
import zoo_mgmt.animals.Dragon;
import zoo_mgmt.animals.Niffler;
import zoo_mgmt.enclosures.ForrestEnc;

public class ForrestEncTest {
  ForrestEnc forrestEnc;
  Niffler niffler;
  Dragon dragon;

  @Before
  public void before() {
    forrestEnc = new ForrestEnc("Forbidden Forrest", true, 200000);
    niffler = new Niffler("Quack", "2007-05-19", 120, true, 9);
    dragon = new Dragon("Norbert", "1895-04-02", DragonType.NORWEGIAN_RIDGEBACK, 130, true, 7);
  }

//all Enclosure Tests have been tested in MediterranianEncTest.java

  @Test
  public void hasName() {
    assertEquals("Forbidden Forrest", forrestEnc.getName());
  }
  
  @Test
  public void canAddAnimals() {
    forrestEnc.addAnimal(niffler);
    assertEquals(1, forrestEnc.countAnimals());
  }
  
  @Test
  public void canOnlyAddGenericAnimal() {
	  forrestEnc.addAnimal(dragon);
	  assertEquals(0, forrestEnc.countAnimals());
  }

  @Test
  public void canRemoveAnimals() {
    forrestEnc.addAnimal(niffler);
    forrestEnc.removeAnimal(niffler);
    assertEquals(0, forrestEnc.countAnimals());
  }
}