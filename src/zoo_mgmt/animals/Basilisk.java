package zoo_mgmt.animals;
import zoo_mgmt.Animal;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.AnimalType;

public class Basilisk extends Animal{
	private double length;
	private boolean venomous;

	public Basilisk(String name, String bday, double length, boolean venomous, boolean inEnclosure, int levelOfFood) {
		super(name, bday, 60, TemporalSpecialisation.DIURNAL, 7, true, AnimalType.SWIMMABLE, inEnclosure, levelOfFood);
		this.length = length;
		this.venomous = venomous;
	}


	//GETTERS
	public double getLength() {
		return this.length;
	}

	public boolean getVenomous() {
		return this.venomous;
	}
	//SPECIFIC BASILISK METHODS
	public String swim() {
		return "swoosh swoosh";
	}

	public String slither() {
		return this.name + " slithers menacingly on the ground.";
	}

	public String lookAtVictim() {
		return this.name + " looks at the victim. It turns to stone.";
	}
}