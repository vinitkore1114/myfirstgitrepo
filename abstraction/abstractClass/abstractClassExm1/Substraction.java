package core_java_topics.abstraction.abstractClass.abstractClassExm1;

public class Substraction extends MyClass{

	@Override
	public void calculate(int a, int b) {
		int c = a - b;
		System.out.println("Substraction of 2 number : " + c);
	}

}
