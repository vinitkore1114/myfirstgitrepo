package core_java_topics.abstraction.abstractClass.abstractClassExm2;

public class Bike extends Rapido{

	int numberOfWheels;
	
	public Bike(String name, int numberOfWheels) {
		super(name);
		this.numberOfWheels = numberOfWheels;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void moving() {
		System.out.println("This is " + name + " running on " + numberOfWheels);
	}

}
