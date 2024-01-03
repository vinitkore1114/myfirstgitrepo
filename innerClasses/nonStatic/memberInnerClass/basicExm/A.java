package core_java_topics.innerClasses.nonStatic.memberInnerClass.basicExm;

public class A {
	private long number = 3543356l;
	private String name = "Vipul Kore";
	
	class B{
		public void displayB() {
			System.out.println(" Number : " + number);
			System.out.println(" Name : " + name);
		}
	}
	public void displayA() {
		System.out.println("This outer class");
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		
		b.displayB();
		a.displayA();

	}

}
