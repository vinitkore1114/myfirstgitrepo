package core_java_topics.abstraction.abstractClass.abstractClassExm1;

public class Addition extends MyClass{

	@Override
	public void calculate(int a, int b) {
		int c = a + b;
		System.out.println("Addition of 2 numbers : " + c);
		
	}

}
