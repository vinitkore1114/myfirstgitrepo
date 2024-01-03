package core_java_topics.abstraction.abstractClass.abstractClassExm2;

public class RapidoApp {

	public static void main(String[] args) {
		
		Bike bike = new Bike("Pulsar", 2);
		Auto auto = new Auto("Auto", 3);
		
		bike.moving();
		auto.moving();
	}

}
