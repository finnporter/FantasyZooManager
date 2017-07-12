package zoo_mgmt;

public class Visitor {

	private String name;
	private double cash;
	private int age;

	public Visitor(String name, double cash, int age) {
		this.name = name;
		this.cash = cash;
		this.age = age;
	}

	//GETTERS
	public String getName() {
		return this.name;
	}

	public double getCash() {
		return this.cash;
	}

	public int getAge() {
		return this.age;
	}



}
