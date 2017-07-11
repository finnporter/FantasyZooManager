package zoo_mgmt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class Animal implements Runnable {
  protected String name;
  private String bday;
  protected double sizeRequirement;
  private TemporalSpecialisation tempSpec;
  protected int levelOfDanger;
  private boolean predator;
  private AnimalType animalType;
  private boolean inEnclosure;
  private int levelOfFood;

  public Animal(
		  String name, String bday, double sizeRequirement, TemporalSpecialisation tempSpec, int levelOfDanger, 
		  boolean predator, AnimalType animalType, boolean inEnclosure, int levelOfFood) {
    this.name = name;
    this.bday = bday;
    this.sizeRequirement = sizeRequirement;
    this.tempSpec = tempSpec;
    this.levelOfDanger = levelOfDanger;
    this.predator = predator;
    this.animalType = animalType;
    this.inEnclosure = inEnclosure;
    this.levelOfFood = levelOfFood;
    
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);            
    scheduler.scheduleAtFixedRate(this, 5,
                                  24*60*60, TimeUnit.SECONDS);
    //can't really test for this, because it hardcodes a delay but what if my tests take longer than that to run? food level will be reset before getLevelOfFood is tested and produce an error.
  }


//GETTERS
  public String getName() {
    return this.name;
  }
  
  public LocalDate getBirthday() {
	  LocalDate birthday = LocalDate.parse(this.bday);
	  return birthday;
  }

  public long getAge() {
	  LocalDate birthdate = getBirthday();
	  return birthdate.until(LocalDate.now(), ChronoUnit.YEARS);
  }

  public double getSizeRequirement() {
    return this.sizeRequirement;
  }

  public TemporalSpecialisation getTempSpec() {
    return this.tempSpec;
  }

  public int getLevelOfDanger() {
    return this.levelOfDanger;
  }

  public boolean getPredator() {
    return this.predator;
  }
  
  public AnimalType getAnimalType() {
	  return this.animalType;
  }
  
  public boolean getInEnclosureStatus() {
	  return this.inEnclosure;
  }
  
  public int getLevelOfFood() {
	  return this.levelOfFood;
  }
 
  
//SETTERS
  public void toggleInEnclosureStatus() {
	  this.inEnclosure = !this.inEnclosure;
	  if (this.inEnclosure == false) {
		  rampage();
	  }
  }

//OTHER ANIMAL FUNCTIONS
  public String eat(int amount) {
	  this.levelOfFood += amount;
	  return "OM NOM NOM. You have raised the level of food to " + this.levelOfFood;
  }
  
  public void resetFoodLevel() {
	  this.levelOfFood = 0;
  }
  
  public void run() {
	  resetFoodLevel();
  }
  
//  LocalDateTime localNow = LocalDateTime.now();
//  ZoneId currentZone = ZoneId.of("Europe/London");
//  ZonedDateTime zonedNow = ZonedDateTime.of(localNow, currentZone);
//  ZonedDateTime zonedNext5; {
//  zonedNext5 = zonedNow.withHour(1).withMinute(0).withSecond(0);
//  if(zonedNow.compareTo(zonedNext5) > 0)
//      zonedNext5 = zonedNext5.plusDays(1);
//
//  Duration duration = Duration.between(zonedNow, zonedNext5);
//  long initalDelay = duration.getSeconds();
 
 
//  }

  public String sleep() {
    return "Zzzzz";
  }

  public String needVet() {
    return "I feel meh. I need a vet, please.";
  }

  public String breakOut() {
	  this.inEnclosure = false;
	  return rampage();
  }
  
  public String rampage() {
	  return "Wrahhh, I broke out and now I'm on a rampage";
  }
  
  public String visible() {
	  LocalTime morning = LocalTime.parse("05:30:00");
	  LocalTime evening = LocalTime.parse("19:00:00");
	  LocalTime night = LocalTime.parse("22:00:00");
	  LocalTime now = LocalTime.now();
	  if (now.isBefore(evening) && now.isAfter(morning) && this.tempSpec == TemporalSpecialisation.DIURNAL) {
		  return "You can see " + this.name;
	  }
	  else if (now.isBefore(night) && now.isAfter(evening) && this.tempSpec == TemporalSpecialisation.CREPUSCULAR) {
		  return "You can see " + this.name;
	  }
	  else if (now.isBefore(morning) && now.isAfter(night) && this.tempSpec == TemporalSpecialisation.NOCTURNAL) {
		  return "You can see " + this.name;
	  }
	  else { return "Sorry this animal is not awake now"; }
  }
}