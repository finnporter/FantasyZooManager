package zoo_mgmt.animals;
import java.util.Random;

import zoo_mgmt.Animal;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.AnimalType;

public class Niffler extends Animal {
	protected int numberOfStolenItems;

	public Niffler(String name, String bday, int numberOfStolenItems, boolean inEnclosure, int levelOfFood) {
		super(name, bday, 30, TemporalSpecialisation.DIURNAL, 3, false, AnimalType.GENERIC, inEnclosure, levelOfFood);
		this.numberOfStolenItems = numberOfStolenItems;
	}


	//GETTERS
	public int getNumberOfStolenItems() {
		return this.numberOfStolenItems;
	}

	//SPECIFIC NIFFLER FUNCTIONS
	public int stealItems(int amount) {
		return this.numberOfStolenItems += amount;
	}

	public int findTreasure(int amount, Random random) {
		boolean result = random.nextBoolean();
		if (result == true) {
			stealItems(amount);
			return this.numberOfStolenItems;
		}
		else {
			return this.numberOfStolenItems;
		}
	}

	public int dig(int amount, Random random) {
		return findTreasure(amount, random);
	} 
}