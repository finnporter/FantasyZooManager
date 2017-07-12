package zoo_mgmt.animals;
import zoo_mgmt.Animal;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.AnimalType;

public class Hippogriff extends Animal {
	private String colour;

	public Hippogriff(String name, String bday, String colour, boolean inEnclosure, int levelOfFood) {
		super(name, bday, 240, TemporalSpecialisation.DIURNAL, 5, false, AnimalType.FLYABLE, inEnclosure, levelOfFood);
		this.colour = colour;
	}


//GETTERS
	public String getColour() {
		return this.colour;
	}

//OTHER FUNCTIONS
	public String fly() {
		return "fwoomp fwoomp";
	}

	public String peck() {
		return "peck peck";
	}

	public String screech() {
		return this.name + " screeches loudly.";
	}
}