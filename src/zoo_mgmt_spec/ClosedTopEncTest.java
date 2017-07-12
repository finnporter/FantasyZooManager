package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.DragonType;
import zoo_mgmt.animals.Dragon;
import zoo_mgmt.animals.Hydra;
import zoo_mgmt.enclosures.ClosedTopEnc;

public class ClosedTopEncTest {
	ClosedTopEnc closedEnc;
	Dragon dragon;
	Hydra hydra;

	@Before
	public void before() {
		closedEnc = new ClosedTopEnc("Dragon's Den", true, 50000);
		dragon = new Dragon("Norbert", "2015-03-14", DragonType.NORWEGIAN_RIDGEBACK, 130, true, 7);
		hydra = new Hydra("Harold", "1913-12-13", 5, "light blue", true, 5);
	}

	@Test
	public void hasName() {
		assertEquals("Dragon's Den", closedEnc.getName());
	}

	@Test
	public void canAddAnimals() {
		closedEnc.addAnimal(dragon);
		assertEquals(1, closedEnc.countAnimals());
	}

	@Test
	public void canOnlyAddFlyableAnimal() {
		closedEnc.addAnimal(hydra);
		assertEquals(0, closedEnc.countAnimals());
	}

	@Test
	public void canRemoveAnimals() {
		closedEnc.addAnimal(dragon);
		closedEnc.removeAnimal(dragon);
		assertEquals(0, closedEnc.countAnimals());
	}
}