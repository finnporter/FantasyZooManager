package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.DragonType;
import zoo_mgmt.EncType;
import zoo_mgmt.animals.Dragon;
import zoo_mgmt.animals.Hydra;
import zoo_mgmt.enclosures.MediterranianEnc;

public class MediterranianEncTest {
  MediterranianEnc medEnc;
  Hydra hydra;
  Dragon dragon;

  @Before
  public void before() {
    medEnc = new MediterranianEnc("Club Med", true, 12000);
    hydra = new Hydra("Harold", "1913-12-13", 5, "light blue", true, 5);
    dragon = new Dragon("Norbert", "2015-03-14", DragonType.NORWEGIAN_RIDGEBACK, 130, true, 7);
  }

  @Test
  public void hasName() {	  
    assertEquals("Club Med", medEnc.getName());
  }

  @Test
  public void isFunctional() {
    assertEquals(true, medEnc.getFuctionalStatus());
  }

  @Test
  public void hasSize() {
    assertEquals(12000, medEnc.getSize(), 0.01);
  }
  
  @Test
  public void hasType() {
	  assertEquals(EncType.AQUARIUM, medEnc.getType());
  }

  @Test
  public void canAddAnimals() {
    medEnc.addAnimal(hydra);
    assertEquals(1, medEnc.countAnimals());
  }
  
  @Test
  public void canOnlyAddSwimmableAnimal() {
	  medEnc.addAnimal(dragon);
	  assertEquals(0, medEnc.countAnimals());
  }

  @Test
  public void canRemoveAnimals() {
    medEnc.addAnimal(hydra);
    medEnc.removeAnimal(hydra);
    assertEquals(0, medEnc.countAnimals());
  }
  
  @Test
  public void completeCodeCoverage() {
	  EncType[] types = EncType.values();
	  EncType type = EncType.valueOf("DESERT");
  }
}