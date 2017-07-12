package zoo_mgmt.enclosures;
import zoo_mgmt.Animal;
import zoo_mgmt.AnimalType;
import zoo_mgmt.EncType;
import zoo_mgmt.Enclosure;

public class ClosedTopEnc extends Enclosure {

	public ClosedTopEnc(String name, boolean functional, double size) {
		super(name, functional, size, EncType.CLOSED_TOP);
	}


	@Override
	public void addAnimal(Animal newAnimal) {
		if(newAnimal.getAnimalType() == AnimalType.FLYABLE){
			animals.add(newAnimal); 
		}
	}	

	@Override
	public void removeAnimal(Animal animal) {
		animals.remove(animal);
	}
}