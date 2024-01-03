package core_java_topics.abstraction.abstractClass.abstractClassExm1;

public class MainApp {

	public static void main(String[] args) {

		MyClass add = new Addition();
		MyClass sub = new Substraction();
		
		add.calculate(20, 30);
		sub.calculate(40, 15);
	}

}
