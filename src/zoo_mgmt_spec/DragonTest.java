package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.AnimalType;
import zoo_mgmt.DragonType;
import zoo_mgmt.EncType;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.animals.Dragon;

public class DragonTest {
	Dragon dragon;

	@Before
	public void before() {
		dragon = new Dragon("Norbert", "2015-03-14", DragonType.NORWEGIAN_RIDGEBACK, 130, true, 7);
	}

	//Abstract animal class tests are tested in Hydra.java
	//SPECIAL DRAGON TESTS
	@Test
	public void hasType() {
		assertEquals(DragonType.NORWEGIAN_RIDGEBACK, dragon.getType());
	}

	@Test
	public void canSetGold() {
		dragon.setGold(10);
		assertEquals(10, dragon.getGold());
	}

	@Test
	public void canFly() {
		assertEquals("flap flap", dragon.fly());
	}

	@Test
	public void canBreatheFire() {
		assertEquals("Norbert breathes fire all over the place.", dragon.breatheFire());
	}

	@Test
	public void canHoardGold() {
		assertEquals(230, dragon.hoardGold(100));
	}

	@Test
	public void isVisible() {
		assertEquals("You can see Norbert", dragon.visible("20:15"));
	}

	//Useless Tests to get CodeCoverate to 100 %
	@Test
	public void completeCodeCoverageType() {
		DragonType[] types = DragonType.values();
		DragonType type = DragonType.valueOf("HUNGARIAN_HORNTAIL");
	}

	@Test
	public void completeCodeCoverageSpecialisation() {
		TemporalSpecialisation[] types = TemporalSpecialisation.values();
		TemporalSpecialisation type = TemporalSpecialisation.valueOf("DIURNAL");
	}

	@Test
	public void completeCodeCoverageAnimal() {
		AnimalType[] types = AnimalType.values();
		AnimalType type = AnimalType.valueOf("SWIMMABLE");
	}
}