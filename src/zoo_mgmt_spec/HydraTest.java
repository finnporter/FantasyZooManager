package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.AnimalType;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.animals.Hydra;

public class HydraTest {
	Hydra hydra;
	Hydra hydra2;

	@Before
	public void before() {
		hydra = new Hydra("Harold", "1913-12-13", 5, "light blue", true, 5);
		hydra2 = new Hydra("Harold2", "1913-12-13", 5, "light blue", false, 5);
	}

	//Abstract Animal Tests
	@Test
	public void hasName() {
		assertEquals("Harold", hydra.getName());
	}

	@Test
	public void hasBirthday() {
		assertEquals("1913-12-13", hydra.getBirthday().toString());
	}

	@Test
	public void hasAge() {
		assertEquals(103, hydra.getAge());
	}

	@Test
	public void hasSizeRequirement() {
		assertEquals(120, hydra.getSizeRequirement(), 0.01);
	}

	@Test
	public void hasTemporalSpecialisation() {
		assertEquals(TemporalSpecialisation.DIURNAL, hydra.getTempSpec());
	} 

	@Test
	public void hasLevelOfDanger() {
		assertEquals(8, hydra.getLevelOfDanger());
	}

	@Test
	public void isPredator() {
		assertEquals(true, hydra.getPredator());
	}

	@Test
	public void hasAnimalType() {
		assertEquals(AnimalType.SWIMMABLE, hydra.getAnimalType());
	}

	@Test
	public void isInEnclosure() {
		assertEquals(true, hydra.getInEnclosureStatus());
	}

	@Test
	public void hasLevelOfFood() {
		assertEquals(5, hydra.getLevelOfFood());
	}

	@Test
	public void canResetLevelOfFood() {
		hydra.resetFoodLevel();
		assertEquals(0, hydra.getLevelOfFood());
	}

	@Test
	public void canUseRunnable() {
		hydra.run();
		assertEquals(0, hydra.getLevelOfFood());
	}

	@Test
	public void canEat() {
		assertEquals("OM NOM NOM. You have raised the level of food to 10", hydra.eat(5));
	}

	@Test
	public void canSleep() {
		assertEquals("Zzzzz", hydra.sleep());
	}

	@Test
	public void canNeedVet() {
		assertEquals("I feel meh. I need a vet, please.", hydra.needVet());
	}

	@Test
	public void canBreakOut() {
		assertEquals("Wrahhh, I broke out and now I'm on a rampage", hydra.breakOut());
	}

	@Test
	public void canToggleInEnclosureStatus() {
		hydra.toggleInEnclosureStatus();
		hydra2.toggleInEnclosureStatus();
		assertEquals(false, hydra.getInEnclosureStatus());
		assertEquals(true, hydra2.getInEnclosureStatus());
	}


	//SPECIAL HYDRA TESTS
	@Test
	public void howManyHeads() {
		assertEquals(5, hydra.getNumberOfHeads());
	}

	@Test
	public void hasColour() {
		assertEquals("light blue", hydra.getColour());
	}

	@Test
	public void canSwim() {
		assertEquals("paddle paddle", hydra.swim());
	}

	@Test
	public void canRegenerateHead() {
		assertEquals(6, hydra.regenerateHead());
	}

	@Test
	public void isVisible() {
		assertEquals("You can see Harold", hydra.visible("14:02"));
	}

}