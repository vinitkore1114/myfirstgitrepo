package core_java_topics.polymorphism.runtimePolymorphism.basicExm;

public class Test {

	public static void main(String[] args) {
		Vehicle twoWheeler = new TwoWheeler();
		Vehicle fourWheeler = new FourWheeler();
		
		twoWheeler.start();
		twoWheeler.stop();
		System.out.println();
		fourWheeler.start();
		fourWheeler.stop();

	}

}
