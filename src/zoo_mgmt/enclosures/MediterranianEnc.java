package zoo_mgmt.enclosures;
import zoo_mgmt.*;

public class MediterranianEnc extends Enclosure {


  public MediterranianEnc(String name, boolean functional, double size) {
    super(name, functional, size, EncType.AQUARIUM);
  }

  public void addAnimal(Animal newAnimal) {
	if(newAnimal.getAnimalType() == AnimalType.SWIMMABLE){
      animals.add(newAnimal); 
   }
  }

  public void removeAnimal(Animal animal) {
    animals.remove(animal);
  }

}