package zoo_mgmt.animals;
import zoo_mgmt.Animal;
import zoo_mgmt.DragonType;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.AnimalType;

public class Dragon extends Animal {
	private DragonType type;
	private int gold;

	public Dragon(String name, String bday, DragonType type, int gold, boolean inEnclosure, int levelOfFood) {
		super(name, bday, 200, TemporalSpecialisation.CREPUSCULAR, 10, true, AnimalType.FLYABLE, inEnclosure, levelOfFood);
		this.type = type;
		this.gold = gold;
	}


//GETTERS
	public DragonType getType() {
		return this.type;
	}

	public int getGold() {
		return this.gold;
	}

//SETTERS
	public void setGold(int amount) {
		this.gold = amount;
	}

//OTHER METHODS
	public String fly() {
		return "flap flap";
	}

	public String breatheFire() {
		return this.name + " breathes fire all over the place.";
	}

	public int hoardGold(int amount) {
		return this.gold += amount;
	}
}