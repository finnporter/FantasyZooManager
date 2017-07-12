package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.animals.Unicorn;
import zoo_mgmt.enclosures.ForrestEnc;

public class EnclosureTest {
	ForrestEnc forrestEnc;
	Unicorn unicorn;

	@Before
	public void before() {
		forrestEnc = new ForrestEnc("Forbidden Forrest", true, 50000);
		unicorn = new Unicorn("Sparkles", "1999-10-10", "purple", 8, 35, true, 6);
	}

	@Test
	public void IsEnclosureEmpty() {
		assertEquals(0, forrestEnc.countAnimals());
	}

	@Test
	public void canAddAnimals() {
		forrestEnc.addAnimal(unicorn);
		assertEquals(1, forrestEnc.countAnimals());
	}

	@Test
	public void canRemoveAnimals() {
		forrestEnc.addAnimal(unicorn);
		forrestEnc.removeAnimal(unicorn);
		assertEquals(0, forrestEnc.countAnimals());
	}

	@Test
	public void canFitIntoEnclosure() {
		assertEquals(true, forrestEnc.checkSize(unicorn));
	}

	@Test
	public void hasCompatibleDangerLevel() {
		forrestEnc.addAnimal(unicorn);
		assertEquals(true, forrestEnc.checkDangerLevel(unicorn));
	}

	@Test
	public void canSafelyAddAnimal() {
		forrestEnc.addAnimal(unicorn);
		assertEquals("Animal added.", forrestEnc.safelyAddAnimal(unicorn));
	}
}